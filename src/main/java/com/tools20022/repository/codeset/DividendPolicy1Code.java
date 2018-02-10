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
import com.tools20022.repository.codeset.DividendPolicy1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the dividend policy of the financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendPolicy1Code#Cash
 * DividendPolicy1Code.Cash}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendPolicy1Code#Units
 * DividendPolicy1Code.Units}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendPolicy1Code#Both
 * DividendPolicy1Code.Both}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DividendPolicyCode
 * DividendPolicyCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DividendPolicy1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the dividend policy of the financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DividendPolicy1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicy1Code
	 * DividendPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final DividendPolicy1Code Cash = new DividendPolicy1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendPolicy1Code.mmObject();
			codeName = DividendPolicyCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicy1Code
	 * DividendPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Units"</li>
	 * </ul>
	 */
	public static final DividendPolicy1Code Units = new DividendPolicy1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Units";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendPolicy1Code.mmObject();
			codeName = DividendPolicyCode.Units.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicy1Code
	 * DividendPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Both"</li>
	 * </ul>
	 */
	public static final DividendPolicy1Code Both = new DividendPolicy1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Both";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendPolicy1Code.mmObject();
			codeName = DividendPolicyCode.Both.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DividendPolicy1Code> codesByName = new LinkedHashMap<>();

	protected DividendPolicy1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DividendPolicy1Code";
				definition = "Specifies the dividend policy of the financial instrument.";
				trace_lazy = () -> DividendPolicyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DividendPolicy1Code.Cash, com.tools20022.repository.codeset.DividendPolicy1Code.Units, com.tools20022.repository.codeset.DividendPolicy1Code.Both);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Units.getCodeName().get(), Units);
		codesByName.put(Both.getCodeName().get(), Both);
	}

	public static DividendPolicy1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DividendPolicy1Code[] values() {
		DividendPolicy1Code[] values = new DividendPolicy1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DividendPolicy1Code> {
		@Override
		public DividendPolicy1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DividendPolicy1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}