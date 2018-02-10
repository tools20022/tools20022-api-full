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
import com.tools20022.repository.codeset.DeliverReturnCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the collateral is to be delivered or returned.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliverReturnCode#Deliver
 * DeliverReturnCode.Deliver}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliverReturnCode#Return
 * DeliverReturnCode.Return}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliverReturn1Code
 * DeliverReturn1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DELV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliverReturnCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if the collateral is to be delivered or returned."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliverReturnCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the collateral is to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliverReturnCode
	 * DeliverReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the collateral is to be delivered."</li>
	 * </ul>
	 */
	public static final DeliverReturnCode Deliver = new DeliverReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliver";
			definition = "Specifies that the collateral is to be delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliverReturnCode.mmObject();
			codeName = "DELV";
		}
	};
	/**
	 * Specifies that the collateral is to be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliverReturnCode
	 * DeliverReturnCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the collateral is to be returned."</li>
	 * </ul>
	 */
	public static final DeliverReturnCode Return = new DeliverReturnCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Specifies that the collateral is to be returned.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliverReturnCode.mmObject();
			codeName = "RETN";
		}
	};
	final static private LinkedHashMap<String, DeliverReturnCode> codesByName = new LinkedHashMap<>();

	protected DeliverReturnCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DELV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliverReturnCode";
				definition = "Specifies if the collateral is to be delivered or returned.";
				derivation_lazy = () -> Arrays.asList(DeliverReturn1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliverReturnCode.Deliver, com.tools20022.repository.codeset.DeliverReturnCode.Return);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Deliver.getCodeName().get(), Deliver);
		codesByName.put(Return.getCodeName().get(), Return);
	}

	public static DeliverReturnCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliverReturnCode[] values() {
		DeliverReturnCode[] values = new DeliverReturnCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliverReturnCode> {
		@Override
		public DeliverReturnCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliverReturnCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}