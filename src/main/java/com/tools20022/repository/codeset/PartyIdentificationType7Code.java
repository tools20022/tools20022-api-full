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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PartyIdentificationType7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies an alternative identification of a party, for example, national
 * registration identification number, passport number, tax identification
 * number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#AdoptionTaxpayerIdentificationNumber
 * PartyIdentificationType7Code.AdoptionTaxpayerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#IdentityCardNumber
 * PartyIdentificationType7Code.IdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#NationalRegistrationIdentificationNumber
 * PartyIdentificationType7Code.NationalRegistrationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#Other
 * PartyIdentificationType7Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#PassportNumber
 * PartyIdentificationType7Code.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#PostOfficeCardNumber
 * PartyIdentificationType7Code.PostOfficeCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#SocialSecurityNumber
 * PartyIdentificationType7Code.SocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#SRSAccountNumber
 * PartyIdentificationType7Code.SRSAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#GunLicenseNumber
 * PartyIdentificationType7Code.GunLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#GenericTaxIdentificationNumber
 * PartyIdentificationType7Code.GenericTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#IndividualTaxpayerIdentificationNumber
 * PartyIdentificationType7Code.IndividualTaxpayerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#CPFAccountNumber
 * PartyIdentificationType7Code.CPFAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#AlienRegistrationNumber
 * PartyIdentificationType7Code.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#DriversLicenseNumber
 * PartyIdentificationType7Code.DriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#EmployerIdentificationNumber
 * PartyIdentificationType7Code.EmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#NonResidentInvestor
 * PartyIdentificationType7Code.NonResidentInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#IndustryClassification
 * PartyIdentificationType7Code.IndustryClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code#GlobalIntermediaryIdentificationNumber
 * PartyIdentificationType7Code.GlobalIntermediaryIdentificationNumber}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of a party, for example, national registration identification number, passport number, tax identification number."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyIdentificationType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdoptionTaxpayerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code AdoptionTaxpayerIdentificationNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdoptionTaxpayerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.AdoptionTaxpayerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentityCardNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code IdentityCardNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentityCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.IdentityCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code NationalRegistrationIdentificationNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalRegistrationIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.NationalRegistrationIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code Other = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code PassportNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.PassportNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostOfficeCardNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code PostOfficeCardNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostOfficeCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.PostOfficeCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//SSNX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code SocialSecurityNumber = new PartyIdentificationType7Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//SSNX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.SocialSecurityNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SRSAccountNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code SRSAccountNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SRSAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.SRSAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GunLicenseNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code GunLicenseNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GunLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.GunLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericTaxIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code GenericTaxIdentificationNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericTaxIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.GenericTaxIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTaxpayerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code IndividualTaxpayerIdentificationNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTaxpayerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.IndividualTaxpayerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CPFAccountNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code CPFAccountNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CPFAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.CPFAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//ARNU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code AlienRegistrationNumber = new PartyIdentificationType7Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//ARNU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.AlienRegistrationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//DRLC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriversLicenseNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code DriversLicenseNumber = new PartyIdentificationType7Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//DRLC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriversLicenseNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.DriversLicenseNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//EINX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code EmployerIdentificationNumber = new PartyIdentificationType7Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//EINX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.EmployerIdentificationNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentInvestor"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code NonResidentInvestor = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.NonResidentInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndustryClassification"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code IndustryClassification = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustryClassification";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.IndustryClassification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType7Code
	 * PartyIdentificationType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalIntermediaryIdentificationNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType7Code GlobalIntermediaryIdentificationNumber = new PartyIdentificationType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalIntermediaryIdentificationNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType7Code.mmObject();
			codeName = PersonIdentificationTypeCode.GlobalIntermediaryIdentificationNumber.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyIdentificationType7Code> codesByName = new LinkedHashMap<>();

	protected PartyIdentificationType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationType7Code";
				definition = "Specifies an alternative identification of a party, for example, national registration identification number, passport number, tax identification number.";
				trace_lazy = () -> PersonIdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyIdentificationType7Code.AdoptionTaxpayerIdentificationNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.IdentityCardNumber,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.NationalRegistrationIdentificationNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.Other,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.PassportNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.PostOfficeCardNumber,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.SocialSecurityNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.SRSAccountNumber,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.GunLicenseNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.GenericTaxIdentificationNumber,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.IndividualTaxpayerIdentificationNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.CPFAccountNumber,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.AlienRegistrationNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.DriversLicenseNumber,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.EmployerIdentificationNumber, com.tools20022.repository.codeset.PartyIdentificationType7Code.NonResidentInvestor,
						com.tools20022.repository.codeset.PartyIdentificationType7Code.IndustryClassification, com.tools20022.repository.codeset.PartyIdentificationType7Code.GlobalIntermediaryIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AdoptionTaxpayerIdentificationNumber.getCodeName().get(), AdoptionTaxpayerIdentificationNumber);
		codesByName.put(IdentityCardNumber.getCodeName().get(), IdentityCardNumber);
		codesByName.put(NationalRegistrationIdentificationNumber.getCodeName().get(), NationalRegistrationIdentificationNumber);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PassportNumber.getCodeName().get(), PassportNumber);
		codesByName.put(PostOfficeCardNumber.getCodeName().get(), PostOfficeCardNumber);
		codesByName.put(SocialSecurityNumber.getCodeName().get(), SocialSecurityNumber);
		codesByName.put(SRSAccountNumber.getCodeName().get(), SRSAccountNumber);
		codesByName.put(GunLicenseNumber.getCodeName().get(), GunLicenseNumber);
		codesByName.put(GenericTaxIdentificationNumber.getCodeName().get(), GenericTaxIdentificationNumber);
		codesByName.put(IndividualTaxpayerIdentificationNumber.getCodeName().get(), IndividualTaxpayerIdentificationNumber);
		codesByName.put(CPFAccountNumber.getCodeName().get(), CPFAccountNumber);
		codesByName.put(AlienRegistrationNumber.getCodeName().get(), AlienRegistrationNumber);
		codesByName.put(DriversLicenseNumber.getCodeName().get(), DriversLicenseNumber);
		codesByName.put(EmployerIdentificationNumber.getCodeName().get(), EmployerIdentificationNumber);
		codesByName.put(NonResidentInvestor.getCodeName().get(), NonResidentInvestor);
		codesByName.put(IndustryClassification.getCodeName().get(), IndustryClassification);
		codesByName.put(GlobalIntermediaryIdentificationNumber.getCodeName().get(), GlobalIntermediaryIdentificationNumber);
	}

	public static PartyIdentificationType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyIdentificationType7Code[] values() {
		PartyIdentificationType7Code[] values = new PartyIdentificationType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyIdentificationType7Code> {
		@Override
		public PartyIdentificationType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyIdentificationType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}