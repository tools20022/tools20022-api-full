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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies an alternative identification of an individual person, for example,
 * national registration identification number, passport number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType3Code
 * PersonIdentificationType3Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmPassportNumber
 * PersonIdentificationTypeV2Code.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmCPFAccountNumber
 * PersonIdentificationTypeV2Code.mmCPFAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmSRSAccountNumber
 * PersonIdentificationTypeV2Code.mmSRSAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmNationalRegistrationIdentificationNumber
 * PersonIdentificationTypeV2Code.mmNationalRegistrationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmOther
 * PersonIdentificationTypeV2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmDriversLicenseNumber
 * PersonIdentificationTypeV2Code.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmSocialSecurityNumber
 * PersonIdentificationTypeV2Code.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmAlienRegistrationNumber
 * PersonIdentificationTypeV2Code.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmIdentityCardNumber
 * PersonIdentificationTypeV2Code.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmEmployerIdentificationNumber
 * PersonIdentificationTypeV2Code.mmEmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmForeignInvestmentIdentityNumber
 * PersonIdentificationTypeV2Code.mmForeignInvestmentIdentityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmTaxIdentificationNumber
 * PersonIdentificationTypeV2Code.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#mmCorporateIdentification
 * PersonIdentificationTypeV2Code.mmCorporateIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CCPT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PersonIdentificationTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number."
 * </li>
 * </ul>
 */
public class PersonIdentificationTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number assigned by a passport authority to a passport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a passport authority to a passport."</li>
	 * </ul>
	 */
	public static final MMCode mmPassportNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "CCPT";
		}
	};
	/**
	 * Account issued by the Central Provident Fund Board (Singapore).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPFAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account issued by the Central Provident Fund Board (Singapore)."</li>
	 * </ul>
	 */
	public static final MMCode mmCPFAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CPFAccountNumber";
			definition = "Account issued by the Central Provident Fund Board (Singapore).";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "CPFA";
		}
	};
	/**
	 * Supplementary retirement scheme account number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SRSAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Supplementary retirement scheme account number."</li>
	 * </ul>
	 */
	public static final MMCode mmSRSAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SRSAccountNumber";
			definition = "Supplementary retirement scheme account number.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "SRSA";
		}
	};
	/**
	 * National registration identification number. In Singapore this is known
	 * as the NRIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "National registration identification number. In Singapore this is known as the NRIC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNationalRegistrationIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationIdentificationNumber";
			definition = "National registration identification number. In Singapore this is known as the NRIC.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "NRIN";
		}
	};
	/**
	 * Another type of identification type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of identification type."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of identification type.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Number assigned by a license authority to a driver's license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a license authority to a driver's license."</li>
	 * </ul>
	 */
	public static final MMCode mmDriversLicenseNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "DRLC";
		}
	};
	/**
	 * Number assigned by a social security agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a social security agency."</li>
	 * </ul>
	 */
	public static final MMCode mmSocialSecurityNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "SOCS";
		}
	};
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a government agency to identify foreign nationals."</li>
	 * </ul>
	 */
	public static final MMCode mmAlienRegistrationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "ARNU";
		}
	};
	/**
	 * Number assigned by a national authority to an identity card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national authority to an identity card."</li>
	 * </ul>
	 */
	public static final MMCode mmIdentityCardNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "IDCD";
		}
	};
	/**
	 * Number assigned to an employer by a registration authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to an employer by a registration authority."</li>
	 * </ul>
	 */
	public static final MMCode mmEmployerIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "EMID";
		}
	};
	/**
	 * Number assigned to a foreign investor (other than the alien number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignInvestmentIdentityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to a foreign investor (other than the alien number)."</li>
	 * </ul>
	 */
	public static final MMCode mmForeignInvestmentIdentityNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignInvestmentIdentityNumber";
			definition = "Number assigned to a foreign investor (other than the alien number).";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "FINN";
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "TXID";
		}
	};
	/**
	 * Number assigned to a corporate entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code
	 * PersonIdentificationTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned to a corporate entity."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateIdentification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateIdentification";
			definition = "Number assigned to a corporate entity.";
			owner_lazy = () -> PersonIdentificationTypeV2Code.mmObject();
			codeName = "CORP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CCPT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationTypeV2Code";
				definition = "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number.";
				code_lazy = () -> Arrays.asList(PersonIdentificationTypeV2Code.mmPassportNumber, PersonIdentificationTypeV2Code.mmCPFAccountNumber, PersonIdentificationTypeV2Code.mmSRSAccountNumber,
						PersonIdentificationTypeV2Code.mmNationalRegistrationIdentificationNumber, PersonIdentificationTypeV2Code.mmOther, PersonIdentificationTypeV2Code.mmDriversLicenseNumber,
						PersonIdentificationTypeV2Code.mmSocialSecurityNumber, PersonIdentificationTypeV2Code.mmAlienRegistrationNumber, PersonIdentificationTypeV2Code.mmIdentityCardNumber,
						PersonIdentificationTypeV2Code.mmEmployerIdentificationNumber, PersonIdentificationTypeV2Code.mmForeignInvestmentIdentityNumber, PersonIdentificationTypeV2Code.mmTaxIdentificationNumber,
						PersonIdentificationTypeV2Code.mmCorporateIdentification);
				derivation_lazy = () -> Arrays.asList(PersonIdentificationType3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}