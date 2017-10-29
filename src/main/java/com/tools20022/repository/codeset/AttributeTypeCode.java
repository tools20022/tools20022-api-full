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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of attribute of a distinguished name (DN).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode#CommonName
 * AttributeTypeCode.CommonName}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AttributeTypeCode#Locality
 * AttributeTypeCode.Locality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode#OrganisationName
 * AttributeTypeCode.OrganisationName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode#OrganisationUnitName
 * AttributeTypeCode.OrganisationUnitName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode#CountryName
 * AttributeTypeCode.CountryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode#EmailAddress
 * AttributeTypeCode.EmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode#ChallengePassword
 * AttributeTypeCode.ChallengePassword}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AttributeType1Code
 * AttributeType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AttributeType2Code
 * AttributeType2Code}</li>
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
 * <li>"CNAT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AttributeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of attribute of a distinguished name (DN)."</li>
 * </ul>
 */
public class AttributeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Common name of the attribute (ASN.1 Object Identifier: id-at-commonName).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode
	 * AttributeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common name of the attribute (ASN.1 Object Identifier: id-at-commonName)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CommonName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommonName";
			definition = "Common name of the attribute (ASN.1 Object Identifier: id-at-commonName).";
			owner_lazy = () -> AttributeTypeCode.mmObject();
			codeName = "CNAT";
		}
	};
	/**
	 * Locality of the attribute (ASN.1 Object Identifier: id-at-localityName).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode
	 * AttributeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Locality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Locality of the attribute (ASN.1 Object Identifier: id-at-localityName)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Locality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Locality";
			definition = "Locality of the attribute (ASN.1 Object Identifier: id-at-localityName).";
			owner_lazy = () -> AttributeTypeCode.mmObject();
			codeName = "LATT";
		}
	};
	/**
	 * Organization name of the attribute (ASN.1 Object Identifier:
	 * id-at-organizationName).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode
	 * AttributeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OATT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organization name of the attribute  (ASN.1 Object Identifier: id-at-organizationName)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode OrganisationName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationName";
			definition = "Organization name of the attribute  (ASN.1 Object Identifier: id-at-organizationName).";
			owner_lazy = () -> AttributeTypeCode.mmObject();
			codeName = "OATT";
		}
	};
	/**
	 * Organization unit name of the attribute (ASN.1 Object Identifier:
	 * id-at-organizationalUnitName).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode
	 * AttributeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationUnitName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organization unit name of the attribute (ASN.1 Object Identifier: id-at-organizationalUnitName)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode OrganisationUnitName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationUnitName";
			definition = "Organization unit name of the attribute (ASN.1 Object Identifier: id-at-organizationalUnitName).";
			owner_lazy = () -> AttributeTypeCode.mmObject();
			codeName = "OUAT";
		}
	};
	/**
	 * Country name of the attribute (ASN.1 Object Identifier:
	 * id-at-countryName).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode
	 * AttributeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CATT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country name of the attribute (ASN.1 Object Identifier: id-at-countryName)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CountryName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryName";
			definition = "Country name of the attribute (ASN.1 Object Identifier: id-at-countryName).";
			owner_lazy = () -> AttributeTypeCode.mmObject();
			codeName = "CATT";
		}
	};
	/**
	 * Email address of the certificate subject.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode
	 * AttributeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Email address of the certificate subject."</li>
	 * </ul>
	 */
	public static final MMCode EmailAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Email address of the certificate subject.";
			owner_lazy = () -> AttributeTypeCode.mmObject();
			codeName = "EMAL";
		}
	};
	/**
	 * Password by which an entity may request certificate revocation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeTypeCode
	 * AttributeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHLG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChallengePassword"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Password by which an entity may request certificate revocation"</li>
	 * </ul>
	 */
	public static final MMCode ChallengePassword = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChallengePassword";
			definition = "Password by which an entity may request certificate revocation";
			owner_lazy = () -> AttributeTypeCode.mmObject();
			codeName = "CHLG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CNAT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AttributeTypeCode";
				definition = "Type of attribute of a distinguished name (DN).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AttributeTypeCode.CommonName, com.tools20022.repository.codeset.AttributeTypeCode.Locality,
						com.tools20022.repository.codeset.AttributeTypeCode.OrganisationName, com.tools20022.repository.codeset.AttributeTypeCode.OrganisationUnitName, com.tools20022.repository.codeset.AttributeTypeCode.CountryName,
						com.tools20022.repository.codeset.AttributeTypeCode.EmailAddress, com.tools20022.repository.codeset.AttributeTypeCode.ChallengePassword);
				derivation_lazy = () -> Arrays.asList(AttributeType1Code.mmObject(), AttributeType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}