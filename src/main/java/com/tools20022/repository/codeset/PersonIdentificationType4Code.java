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
import com.tools20022.repository.codeset.PersonIdentificationType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of identification used for the Cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code#PassportNumber
 * PersonIdentificationType4Code.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code#DriversLicenseNumber
 * PersonIdentificationType4Code.DriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code#EmployeeNumber
 * PersonIdentificationType4Code.EmployeeNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code#DriverNumber
 * PersonIdentificationType4Code.DriverNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
 * PersonIdentificationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PersonIdentificationType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of identification used for the Cardholder."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PASS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PersonIdentificationType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code
	 * PersonIdentificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PersonIdentificationType4Code PassportNumber = new PersonIdentificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType4Code.mmObject();
			codeName = PersonIdentificationTypeCode.PassportNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code
	 * PersonIdentificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PersonIdentificationType4Code DriversLicenseNumber = new PersonIdentificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriversLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType4Code.mmObject();
			codeName = PersonIdentificationTypeCode.DriversLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code
	 * PersonIdentificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PersonIdentificationType4Code EmployeeNumber = new PersonIdentificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType4Code.mmObject();
			codeName = PersonIdentificationTypeCode.EmployeeNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code
	 * PersonIdentificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PersonIdentificationType4Code DriverNumber = new PersonIdentificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType4Code.mmObject();
			codeName = PersonIdentificationTypeCode.DriverNumber.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PersonIdentificationType4Code> codesByName = new LinkedHashMap<>();

	protected PersonIdentificationType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PASS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationType4Code";
				definition = "Type of identification used for the Cardholder.";
				trace_lazy = () -> PersonIdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PersonIdentificationType4Code.PassportNumber, com.tools20022.repository.codeset.PersonIdentificationType4Code.DriversLicenseNumber,
						com.tools20022.repository.codeset.PersonIdentificationType4Code.EmployeeNumber, com.tools20022.repository.codeset.PersonIdentificationType4Code.DriverNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PassportNumber.getCodeName().get(), PassportNumber);
		codesByName.put(DriversLicenseNumber.getCodeName().get(), DriversLicenseNumber);
		codesByName.put(EmployeeNumber.getCodeName().get(), EmployeeNumber);
		codesByName.put(DriverNumber.getCodeName().get(), DriverNumber);
	}

	public static PersonIdentificationType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PersonIdentificationType4Code[] values() {
		PersonIdentificationType4Code[] values = new PersonIdentificationType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PersonIdentificationType4Code> {
		@Override
		public PersonIdentificationType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PersonIdentificationType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}