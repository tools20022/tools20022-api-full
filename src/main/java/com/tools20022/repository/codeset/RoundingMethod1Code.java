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
import com.tools20022.repository.codeset.RoundingMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines how the rounding amount was applied in the calculation. For example,
 * should the amount of collateral required be rounded up, down, to the closer
 * integral multiple specified or not rounded.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethod1Code#Down
 * RoundingMethod1Code.Down}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethod1Code#Up
 * RoundingMethod1Code.Up}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethod1Code#None
 * RoundingMethod1Code.None}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingMethod1Code#Closer
 * RoundingMethod1Code.Closer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RoundingMethodCode
 * RoundingMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DRDW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RoundingMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RoundingMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethod1Code
	 * RoundingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Down"</li>
	 * </ul>
	 */
	public static final RoundingMethod1Code Down = new RoundingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Down";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethod1Code.mmObject();
			codeName = RoundingMethodCode.Down.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethod1Code
	 * RoundingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Up"</li>
	 * </ul>
	 */
	public static final RoundingMethod1Code Up = new RoundingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Up";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethod1Code.mmObject();
			codeName = RoundingMethodCode.Up.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethod1Code
	 * RoundingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * </ul>
	 */
	public static final RoundingMethod1Code None = new RoundingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethod1Code.mmObject();
			codeName = RoundingMethodCode.None.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethod1Code
	 * RoundingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closer"</li>
	 * </ul>
	 */
	public static final RoundingMethod1Code Closer = new RoundingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closer";
			owner_lazy = () -> com.tools20022.repository.codeset.RoundingMethod1Code.mmObject();
			codeName = RoundingMethodCode.Closer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RoundingMethod1Code> codesByName = new LinkedHashMap<>();

	protected RoundingMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DRDW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoundingMethod1Code";
				definition = "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
				trace_lazy = () -> RoundingMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoundingMethod1Code.Down, com.tools20022.repository.codeset.RoundingMethod1Code.Up, com.tools20022.repository.codeset.RoundingMethod1Code.None,
						com.tools20022.repository.codeset.RoundingMethod1Code.Closer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Down.getCodeName().get(), Down);
		codesByName.put(Up.getCodeName().get(), Up);
		codesByName.put(None.getCodeName().get(), None);
		codesByName.put(Closer.getCodeName().get(), Closer);
	}

	public static RoundingMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RoundingMethod1Code[] values() {
		RoundingMethod1Code[] values = new RoundingMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RoundingMethod1Code> {
		@Override
		public RoundingMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RoundingMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}