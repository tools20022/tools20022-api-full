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
import com.tools20022.repository.codeset.DTCCQuantitySoughtCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the quantity sought type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode#Quantity
 * DTCCQuantitySoughtCode.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode#CheckComments
 * DTCCQuantitySoughtCode.CheckComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode#Percentage
 * DTCCQuantitySoughtCode.Percentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code
 * DTCCQuantitySought1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCQuantitySoughtCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the quantity sought type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"QTTY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCQuantitySoughtCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity Sought expressed as quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode
	 * DTCCQuantitySoughtCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTTY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity Sought expressed as quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCQuantitySoughtCode Quantity = new DTCCQuantitySoughtCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity Sought expressed as quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCQuantitySoughtCode.mmObject();
			codeName = "QTTY";
		}
	};
	/**
	 * Check Quantity Sought Comments for quantity sought (irregular
	 * expression).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode
	 * DTCCQuantitySoughtCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Check Quantity Sought Comments for quantity sought (irregular expression)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCQuantitySoughtCode CheckComments = new DTCCQuantitySoughtCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckComments";
			definition = "Check Quantity Sought Comments for quantity sought (irregular expression).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCQuantitySoughtCode.mmObject();
			codeName = "CHCO";
		}
	};
	/**
	 * Quantity sought is expressed as percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode
	 * DTCCQuantitySoughtCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRTG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity sought is expressed as percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCQuantitySoughtCode Percentage = new DTCCQuantitySoughtCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Quantity sought is expressed as percentage.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCQuantitySoughtCode.mmObject();
			codeName = "PRTG";
		}
	};
	final static private LinkedHashMap<String, DTCCQuantitySoughtCode> codesByName = new LinkedHashMap<>();

	protected DTCCQuantitySoughtCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("QTTY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCQuantitySoughtCode";
				definition = "Specifies the quantity sought type.";
				derivation_lazy = () -> Arrays.asList(DTCCQuantitySought1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCQuantitySoughtCode.Quantity, com.tools20022.repository.codeset.DTCCQuantitySoughtCode.CheckComments,
						com.tools20022.repository.codeset.DTCCQuantitySoughtCode.Percentage);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Quantity.getCodeName().get(), Quantity);
		codesByName.put(CheckComments.getCodeName().get(), CheckComments);
		codesByName.put(Percentage.getCodeName().get(), Percentage);
	}

	public static DTCCQuantitySoughtCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCQuantitySoughtCode[] values() {
		DTCCQuantitySoughtCode[] values = new DTCCQuantitySoughtCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCQuantitySoughtCode> {
		@Override
		public DTCCQuantitySoughtCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCQuantitySoughtCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}