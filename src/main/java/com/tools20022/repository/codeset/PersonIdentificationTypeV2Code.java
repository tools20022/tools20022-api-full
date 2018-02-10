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
import com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#PassportNumber
 * PersonIdentificationTypeV2Code.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#CPFAccountNumber
 * PersonIdentificationTypeV2Code.CPFAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#SRSAccountNumber
 * PersonIdentificationTypeV2Code.SRSAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#NationalRegistrationIdentificationNumber
 * PersonIdentificationTypeV2Code.NationalRegistrationIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#Other
 * PersonIdentificationTypeV2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#DriversLicenseNumber
 * PersonIdentificationTypeV2Code.DriversLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#SocialSecurityNumber
 * PersonIdentificationTypeV2Code.SocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#AlienRegistrationNumber
 * PersonIdentificationTypeV2Code.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#IdentityCardNumber
 * PersonIdentificationTypeV2Code.IdentityCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#EmployerIdentificationNumber
 * PersonIdentificationTypeV2Code.EmployerIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#ForeignInvestmentIdentityNumber
 * PersonIdentificationTypeV2Code.ForeignInvestmentIdentityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#TaxIdentificationNumber
 * PersonIdentificationTypeV2Code.TaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationTypeV2Code#CorporateIdentification
 * PersonIdentificationTypeV2Code.CorporateIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PersonIdentificationType3Code
 * PersonIdentificationType3Code}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PersonIdentificationTypeV2Code extends MMCode {

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
	public static final PersonIdentificationTypeV2Code PassportNumber = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority to a passport.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code CPFAccountNumber = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CPFAccountNumber";
			definition = "Account issued by the Central Provident Fund Board (Singapore).";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code SRSAccountNumber = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SRSAccountNumber";
			definition = "Supplementary retirement scheme account number.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code NationalRegistrationIdentificationNumber = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationIdentificationNumber";
			definition = "National registration identification number. In Singapore this is known as the NRIC.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code Other = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of identification type.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//DRLC</li>
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
	public static final PersonIdentificationTypeV2Code DriversLicenseNumber = new PersonIdentificationTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//DRLC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DriversLicenseNumber";
			definition = "Number assigned by a license authority to a driver's license.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//SSNX</li>
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
	public static final PersonIdentificationTypeV2Code SocialSecurityNumber = new PersonIdentificationTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//SSNX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//ARNU</li>
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
	public static final PersonIdentificationTypeV2Code AlienRegistrationNumber = new PersonIdentificationTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//ARNU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code IdentityCardNumber = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentityCardNumber";
			definition = "Number assigned by a national authority to an identity card.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE//EINX</li>
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
	public static final PersonIdentificationTypeV2Code EmployerIdentificationNumber = new PersonIdentificationTypeV2Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE//EINX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployerIdentificationNumber";
			definition = "Number assigned to an employer by a registration authority.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code ForeignInvestmentIdentityNumber = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignInvestmentIdentityNumber";
			definition = "Number assigned to a foreign investor (other than the alien number).";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code TaxIdentificationNumber = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
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
	public static final PersonIdentificationTypeV2Code CorporateIdentification = new PersonIdentificationTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateIdentification";
			definition = "Number assigned to a corporate entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.mmObject();
			codeName = "CORP";
		}
	};
	final static private LinkedHashMap<String, PersonIdentificationTypeV2Code> codesByName = new LinkedHashMap<>();

	protected PersonIdentificationTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CCPT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentificationTypeV2Code";
				definition = "Specifies an alternative identification of an individual person, for example, national registration identification number, passport number.";
				derivation_lazy = () -> Arrays.asList(PersonIdentificationType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.PassportNumber, com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.CPFAccountNumber,
						com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.SRSAccountNumber, com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.NationalRegistrationIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.Other, com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.DriversLicenseNumber,
						com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.SocialSecurityNumber, com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.AlienRegistrationNumber,
						com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.IdentityCardNumber, com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.EmployerIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.ForeignInvestmentIdentityNumber, com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.TaxIdentificationNumber,
						com.tools20022.repository.codeset.PersonIdentificationTypeV2Code.CorporateIdentification);
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
		codesByName.put(ForeignInvestmentIdentityNumber.getCodeName().get(), ForeignInvestmentIdentityNumber);
		codesByName.put(TaxIdentificationNumber.getCodeName().get(), TaxIdentificationNumber);
		codesByName.put(CorporateIdentification.getCodeName().get(), CorporateIdentification);
	}

	public static PersonIdentificationTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PersonIdentificationTypeV2Code[] values() {
		PersonIdentificationTypeV2Code[] values = new PersonIdentificationTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PersonIdentificationTypeV2Code> {
		@Override
		public PersonIdentificationTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PersonIdentificationTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}