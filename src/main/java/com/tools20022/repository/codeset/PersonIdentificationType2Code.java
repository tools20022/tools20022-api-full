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
import com.tools20022.repository.codeset.PersonIdentificationType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#PassportNumber
 * PersonIdentificationType2Code.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#CPFAccountNumber
 * PersonIdentificationType2Code.CPFAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#SRSAccountNumber
 * PersonIdentificationType2Code.SRSAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#NationalRegistrationIdentificationNumber
 * PersonIdentificationType2Code.NationalRegistrationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#DriversLicenseNumber
 * PersonIdentificationType2Code.DriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#SocialSecurityNumber
 * PersonIdentificationType2Code.SocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#AlienRegistrationNumber
 * PersonIdentificationType2Code.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#IdentityCardNumber
 * PersonIdentificationType2Code.IdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code#EmployerIdentificationNumber
 * PersonIdentificationType2Code.EmployerIdentificationNumber}</li>
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
 * "PersonIdentificationType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PersonIdentificationType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code PassportNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.PassportNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPFAccountNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code CPFAccountNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPFAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.CPFAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SRSAccountNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code SRSAccountNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SRSAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.SRSAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code NationalRegistrationIdentificationNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalRegistrationIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.NationalRegistrationIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code DriversLicenseNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriversLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.DriversLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code SocialSecurityNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.SocialSecurityNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code AlienRegistrationNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.AlienRegistrationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code IdentityCardNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.IdentityCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
	 * PersonIdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PersonIdentificationType2Code EmployerIdentificationNumber = new PersonIdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationType2Code.mmObject();
			codeName = PersonIdentificationTypeCode.EmployerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PersonIdentificationType2Code> codesByName = new LinkedHashMap<>();

	protected PersonIdentificationType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PASS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationType2Code";
				definition = "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number.";
				trace_lazy = () -> PersonIdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PersonIdentificationType2Code.PassportNumber, com.tools20022.repository.codeset.PersonIdentificationType2Code.CPFAccountNumber,
						com.tools20022.repository.codeset.PersonIdentificationType2Code.SRSAccountNumber, com.tools20022.repository.codeset.PersonIdentificationType2Code.NationalRegistrationIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationType2Code.DriversLicenseNumber, com.tools20022.repository.codeset.PersonIdentificationType2Code.SocialSecurityNumber,
						com.tools20022.repository.codeset.PersonIdentificationType2Code.AlienRegistrationNumber, com.tools20022.repository.codeset.PersonIdentificationType2Code.IdentityCardNumber,
						com.tools20022.repository.codeset.PersonIdentificationType2Code.EmployerIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PassportNumber.getCodeName().get(), PassportNumber);
		codesByName.put(CPFAccountNumber.getCodeName().get(), CPFAccountNumber);
		codesByName.put(SRSAccountNumber.getCodeName().get(), SRSAccountNumber);
		codesByName.put(NationalRegistrationIdentificationNumber.getCodeName().get(), NationalRegistrationIdentificationNumber);
		codesByName.put(DriversLicenseNumber.getCodeName().get(), DriversLicenseNumber);
		codesByName.put(SocialSecurityNumber.getCodeName().get(), SocialSecurityNumber);
		codesByName.put(AlienRegistrationNumber.getCodeName().get(), AlienRegistrationNumber);
		codesByName.put(IdentityCardNumber.getCodeName().get(), IdentityCardNumber);
		codesByName.put(EmployerIdentificationNumber.getCodeName().get(), EmployerIdentificationNumber);
	}

	public static PersonIdentificationType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PersonIdentificationType2Code[] values() {
		PersonIdentificationType2Code[] values = new PersonIdentificationType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PersonIdentificationType2Code> {
		@Override
		public PersonIdentificationType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PersonIdentificationType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}