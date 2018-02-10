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
import com.tools20022.repository.codeset.ChargeType10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of service for which a charge is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType10Code#BackEndLoad
 * ChargeType10Code.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType10Code#FrontEndLoad
 * ChargeType10Code.FrontEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType10Code#Penalty
 * ChargeType10Code.Penalty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode ChargeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeType10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of service for which a charge is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType10Code
	 * ChargeType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType10Code BackEndLoad = new ChargeType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType10Code.mmObject();
			codeName = ChargeTypeCode.BackEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType10Code
	 * ChargeType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType10Code FrontEndLoad = new ChargeType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType10Code.mmObject();
			codeName = ChargeTypeCode.FrontEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType10Code
	 * ChargeType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Penalty"</li>
	 * </ul>
	 */
	public static final ChargeType10Code Penalty = new ChargeType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Penalty";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType10Code.mmObject();
			codeName = ChargeTypeCode.Penalty.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType10Code> codesByName = new LinkedHashMap<>();

	protected ChargeType10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType10Code";
				definition = "Specifies the type of service for which a charge is asked or paid.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType10Code.BackEndLoad, com.tools20022.repository.codeset.ChargeType10Code.FrontEndLoad, com.tools20022.repository.codeset.ChargeType10Code.Penalty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(FrontEndLoad.getCodeName().get(), FrontEndLoad);
		codesByName.put(Penalty.getCodeName().get(), Penalty);
	}

	public static ChargeType10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType10Code[] values() {
		ChargeType10Code[] values = new ChargeType10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType10Code> {
		@Override
		public ChargeType10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}