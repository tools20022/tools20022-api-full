/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RoundingDirection2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the rounding direction applied to nearest unit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code#RoundUp
 * RoundingDirection2Code.RoundUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code#RoundDown
 * RoundingDirection2Code.RoundDown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
 * RoundingDirectionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RDUP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RoundingDirection2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the rounding direction applied to nearest unit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RoundingDirection2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code
	 * RoundingDirection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUp"</li>
	 * </ul>
	 */
	public static final RoundingDirection2Code RoundUp = new RoundingDirection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundUp";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirection2Code.mmObject();
			codeName = RoundingDirectionCode.RoundUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code
	 * RoundingDirection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDown"</li>
	 * </ul>
	 */
	public static final RoundingDirection2Code RoundDown = new RoundingDirection2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDown";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingDirection2Code.mmObject();
			codeName = RoundingDirectionCode.RoundDown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RoundingDirection2Code> codesByName = new LinkedHashMap<>();

	protected RoundingDirection2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RDUP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoundingDirection2Code";
				definition = "Specifies the rounding direction applied to nearest unit.";
				trace_lazy = () -> RoundingDirectionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoundingDirection2Code.RoundUp, com.tools20022.repository.codeset.RoundingDirection2Code.RoundDown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RoundUp.getCodeName().get(), RoundUp);
		codesByName.put(RoundDown.getCodeName().get(), RoundDown);
	}

	public static RoundingDirection2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RoundingDirection2Code[] values() {
		RoundingDirection2Code[] values = new RoundingDirection2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RoundingDirection2Code> {
		@Override
		public RoundingDirection2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RoundingDirection2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}