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
import com.tools20022.repository.codeset.PersonIdentificationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies an alternative identification of an individual person, for example,
 * national registration identification number, passport number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#PassportNumber
 * PersonIdentificationType1Code.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#CPFAccountNumber
 * PersonIdentificationType1Code.CPFAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#SRSAccountNumber
 * PersonIdentificationType1Code.SRSAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#NationalRegistrationIdentificationNumber
 * PersonIdentificationType1Code.NationalRegistrationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#Other
 * PersonIdentificationType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#DriversLicenseNumber
 * PersonIdentificationType1Code.DriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#SocialSecurityNumber
 * PersonIdentificationType1Code.SocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#AlienRegistrationNumber
 * PersonIdentificationType1Code.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#IdentityCardNumber
 * PersonIdentificationType1Code.IdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code#EmployerIdentificationNumber
 * PersonIdentificationType1Code.EmployerIdentificationNumber}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PersonIdentificationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PersonIdentificationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code PassportNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.PassportNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPFAccountNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code CPFAccountNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPFAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.CPFAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SRSAccountNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code SRSAccountNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SRSAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.SRSAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code NationalRegistrationIdentificationNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalRegistrationIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.NationalRegistrationIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code Other = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code DriversLicenseNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriversLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.DriversLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code SocialSecurityNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.SocialSecurityNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code AlienRegistrationNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.AlienRegistrationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code IdentityCardNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.IdentityCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
	 * PersonIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType1Code EmployerIdentificationNumber = new PersonIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType1Code.mmObject();
			codeName = PersonIdentificationTypeCode.EmployerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PersonIdentificationType1Code> codesByName = new LinkedHashMap<>();

	protected PersonIdentificationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PASS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationType1Code";
				definition = "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number.";
				trace_lazy = () -> PersonIdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PersonIdentificationType1Code.PassportNumber, com.tools20022.repository.codeset.PersonIdentificationType1Code.CPFAccountNumber,
						com.tools20022.repository.codeset.PersonIdentificationType1Code.SRSAccountNumber, com.tools20022.repository.codeset.PersonIdentificationType1Code.NationalRegistrationIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationType1Code.Other, com.tools20022.repository.codeset.PersonIdentificationType1Code.DriversLicenseNumber,
						com.tools20022.repository.codeset.PersonIdentificationType1Code.SocialSecurityNumber, com.tools20022.repository.codeset.PersonIdentificationType1Code.AlienRegistrationNumber,
						com.tools20022.repository.codeset.PersonIdentificationType1Code.IdentityCardNumber, com.tools20022.repository.codeset.PersonIdentificationType1Code.EmployerIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PassportNumber.getCodeName().get(), PassportNumber);
		codesByName.put(CPFAccountNumber.getCodeName().get(), CPFAccountNumber);
		codesByName.put(SRSAccountNumber.getCodeName().get(), SRSAccountNumber);
		codesByName.put(NationalRegistrationIdentificationNumber.getCodeName().get(), NationalRegistrationIdentificationNumber);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(DriversLicenseNumber.getCodeName().get(), DriversLicenseNumber);
		codesByName.put(SocialSecurityNumber.getCodeName().get(), SocialSecurityNumber);
		codesByName.put(AlienRegistrationNumber.getCodeName().get(), AlienRegistrationNumber);
		codesByName.put(IdentityCardNumber.getCodeName().get(), IdentityCardNumber);
		codesByName.put(EmployerIdentificationNumber.getCodeName().get(), EmployerIdentificationNumber);
	}

	public static PersonIdentificationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PersonIdentificationType1Code[] values() {
		PersonIdentificationType1Code[] values = new PersonIdentificationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PersonIdentificationType1Code> {
		@Override
		public PersonIdentificationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PersonIdentificationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}