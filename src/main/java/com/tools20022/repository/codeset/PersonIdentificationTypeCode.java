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
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType1Code
 * PersonIdentificationType1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType5Code
 * PersonIdentificationType5Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType4Code
 * PersonIdentificationType4Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType2Code
 * PersonIdentificationType2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType6Code
 * PersonIdentificationType6Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
 * PartyIdentificationType7Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmPassportNumber
 * PersonIdentificationTypeCode.mmPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmCPFAccountNumber
 * PersonIdentificationTypeCode.mmCPFAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmSRSAccountNumber
 * PersonIdentificationTypeCode.mmSRSAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmNationalRegistrationIdentificationNumber
 * PersonIdentificationTypeCode.mmNationalRegistrationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmOther
 * PersonIdentificationTypeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmDriversLicenseNumber
 * PersonIdentificationTypeCode.mmDriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmSocialSecurityNumber
 * PersonIdentificationTypeCode.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmAlienRegistrationNumber
 * PersonIdentificationTypeCode.mmAlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmIdentityCardNumber
 * PersonIdentificationTypeCode.mmIdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmEmployerIdentificationNumber
 * PersonIdentificationTypeCode.mmEmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmDriverNumber
 * PersonIdentificationTypeCode.mmDriverNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmEmployeeNumber
 * PersonIdentificationTypeCode.mmEmployeeNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmGunLicenseNumber
 * PersonIdentificationTypeCode.mmGunLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmPostOfficeCardNumber
 * PersonIdentificationTypeCode.mmPostOfficeCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmAdoptionTaxpayerIdentificationNumber
 * PersonIdentificationTypeCode.mmAdoptionTaxpayerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmIndividualTaxpayerIdentificationNumber
 * PersonIdentificationTypeCode.mmIndividualTaxpayerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmGenericTaxIdentificationNumber
 * PersonIdentificationTypeCode.mmGenericTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmGlobalIntermediaryIdentificationNumber
 * PersonIdentificationTypeCode.mmGlobalIntermediaryIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmNonResidentInvestor
 * PersonIdentificationTypeCode.mmNonResidentInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode#mmIndustryClassification
 * PersonIdentificationTypeCode.mmIndustryClassification}</li>
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
 * <li>"PASS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PersonIdentificationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number."
 * </li>
 * </ul>
 */
public class PersonIdentificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number assigned by a passport authority to a passport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Account issued by the Central Provident Fund Board (Singapore).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "CPFA";
		}
	};
	/**
	 * Supplementary retirement scheme account number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "NRIN";
		}
	};
	/**
	 * Another type of identification type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Number assigned by a license authority to a driver's license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "DRLC";
		}
	};
	/**
	 * Number assigned by a social security agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "SOCS";
		}
	};
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AREG"</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "AREG";
		}
	};
	/**
	 * Number assigned by a national authority to an identity card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "IDCD";
		}
	};
	/**
	 * Number assigned to an employer by a registration authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
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
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "EMID";
		}
	};
	/**
	 * Driver number, assigned by the fleet manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Driver number, assigned by the fleet manager."</li>
	 * </ul>
	 */
	public static final MMCode mmDriverNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DriverNumber";
			definition = "Driver number, assigned by the fleet manager.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "DRVR";
		}
	};
	/**
	 * Employee number assigned by the company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EEID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Employee number assigned by the company."</li>
	 * </ul>
	 */
	public static final MMCode mmEmployeeNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployeeNumber";
			definition = "Employee number assigned by the company.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "EEID";
		}
	};
	/**
	 * Gun license number as assigned by a gun licensing authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUNL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GunLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Gun license number as assigned by a gun licensing authority."</li>
	 * </ul>
	 */
	public static final MMCode mmGunLicenseNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GunLicenseNumber";
			definition = "Gun license number as assigned by a gun licensing authority.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "GUNL";
		}
	};
	/**
	 * Post office card number as assigned by a national post office.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostOfficeCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Post office card number as assigned by a national post office."</li>
	 * </ul>
	 */
	public static final MMCode mmPostOfficeCardNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostOfficeCardNumber";
			definition = "Post office card number as assigned by a national post office.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "POCD";
		}
	};
	/**
	 * Temporary tax processing number (used in the domestic adoption of a
	 * child).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdoptionTaxpayerIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Temporary tax processing number (used in the domestic adoption of a child)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdoptionTaxpayerIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdoptionTaxpayerIdentificationNumber";
			definition = "Temporary tax processing number (used in the domestic adoption of a child).";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "ATIN";
		}
	};
	/**
	 * Tax processing number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTaxpayerIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax processing number."</li>
	 * </ul>
	 */
	public static final MMCode mmIndividualTaxpayerIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTaxpayerIdentificationNumber";
			definition = "Tax processing number.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "ITIN";
		}
	};
	/**
	 * Generic tax identification number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericTaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Generic tax identification number."</li>
	 * </ul>
	 */
	public static final MMCode mmGenericTaxIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericTaxIdentificationNumber";
			definition = "Generic tax identification number.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "GTIN";
		}
	};
	/**
	 * Global intermediary tax identification number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalIntermediaryIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Global intermediary tax identification number."</li>
	 * </ul>
	 */
	public static final MMCode mmGlobalIntermediaryIdentificationNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalIntermediaryIdentificationNumber";
			definition = "Global intermediary tax identification number.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "GIIN";
		}
	};
	/**
	 * Number that identifies the type of investor registered at a securities
	 * and exchange commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the type of investor registered at a securities and exchange commission.  "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonResidentInvestor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentInvestor";
			definition = "Number that identifies the type of investor registered at a securities and exchange commission.  ";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "NINV";
		}
	};
	/**
	 * Number, typically assigned by a government to describe ownership,
	 * administrative and authoritative relations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeCode
	 * PersonIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndustryClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number, typically assigned by a government to describe ownership, administrative and authoritative relations."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIndustryClassification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustryClassification";
			definition = "Number, typically assigned by a government to describe ownership, administrative and authoritative relations.";
			owner_lazy = () -> PersonIdentificationTypeCode.mmObject();
			codeName = "INCL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PASS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationTypeCode";
				definition = "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number.";
				code_lazy = () -> Arrays.asList(PersonIdentificationTypeCode.mmPassportNumber, PersonIdentificationTypeCode.mmCPFAccountNumber, PersonIdentificationTypeCode.mmSRSAccountNumber,
						PersonIdentificationTypeCode.mmNationalRegistrationIdentificationNumber, PersonIdentificationTypeCode.mmOther, PersonIdentificationTypeCode.mmDriversLicenseNumber,
						PersonIdentificationTypeCode.mmSocialSecurityNumber, PersonIdentificationTypeCode.mmAlienRegistrationNumber, PersonIdentificationTypeCode.mmIdentityCardNumber,
						PersonIdentificationTypeCode.mmEmployerIdentificationNumber, PersonIdentificationTypeCode.mmDriverNumber, PersonIdentificationTypeCode.mmEmployeeNumber, PersonIdentificationTypeCode.mmGunLicenseNumber,
						PersonIdentificationTypeCode.mmPostOfficeCardNumber, PersonIdentificationTypeCode.mmAdoptionTaxpayerIdentificationNumber, PersonIdentificationTypeCode.mmIndividualTaxpayerIdentificationNumber,
						PersonIdentificationTypeCode.mmGenericTaxIdentificationNumber, PersonIdentificationTypeCode.mmGlobalIntermediaryIdentificationNumber, PersonIdentificationTypeCode.mmNonResidentInvestor,
						PersonIdentificationTypeCode.mmIndustryClassification);
				derivation_lazy = () -> Arrays.asList(PersonIdentificationType1Code.mmObject(), PersonIdentificationType5Code.mmObject(), PersonIdentificationType4Code.mmObject(), PersonIdentificationType2Code.mmObject(),
						PersonIdentificationType6Code.mmObject(), PartyIdentificationType7Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}