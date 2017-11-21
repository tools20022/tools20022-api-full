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
 * Specifies the type of Common Reporting Standard (CRS) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmSelfCertificationSeparateDocument
 * CRSFormTypeCode.mmSelfCertificationSeparateDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmSelfCertificationWithAccountOpeningContract
 * CRSFormTypeCode.mmSelfCertificationWithAccountOpeningContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmCertificateOfResidence
 * CRSFormTypeCode.mmCertificateOfResidence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmCertificateIdentificationGovernment
 * CRSFormTypeCode.mmCertificateIdentificationGovernment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmOfficialDocumentGovernmentForEntity
 * CRSFormTypeCode.mmOfficialDocumentGovernmentForEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmOtherDocumentOrReport
 * CRSFormTypeCode.mmOtherDocumentOrReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmStandardised
 * CRSFormTypeCode.mmStandardised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode#mmPublicInformationEntity
 * CRSFormTypeCode.mmPublicInformationEntity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSFormType1Code
 * CRSFormType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CRSFormTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of Common Reporting Standard  (CRS) form."</li>
 * </ul>
 */
public class CRSFormTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Self certification as a separate document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationSeparateDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Self certification as a separate document."</li>
	 * </ul>
	 */
	public static final MMCode mmSelfCertificationSeparateDocument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationSeparateDocument";
			definition = "Self certification as a separate document.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER1";
		}
	};
	/**
	 * Self certification as a document included into contract of the account
	 * opening.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationWithAccountOpeningContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Self certification as a document included into contract of the account opening."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSelfCertificationWithAccountOpeningContract = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationWithAccountOpeningContract";
			definition = "Self certification as a document included into contract of the account opening.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER2";
		}
	};
	/**
	 * Certificate of residence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfResidence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of residence."</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfResidence = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfResidence";
			definition = "Certificate of residence.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER3";
		}
	};
	/**
	 * Certificate of Identification issued by a government.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentificationGovernment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of Identification issued by a government."</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateIdentificationGovernment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentificationGovernment";
			definition = "Certificate of Identification issued by a government.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER4";
		}
	};
	/**
	 * Official documentation issued by a government for the entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialDocumentGovernmentForEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Official documentation issued by a government for the entity."</li>
	 * </ul>
	 */
	public static final MMCode mmOfficialDocumentGovernmentForEntity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialDocumentGovernmentForEntity";
			definition = "Official documentation issued by a government for the entity.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER5";
		}
	};
	/**
	 * Financial statement, third party credit report, bankruptcy filing or a
	 * securities regulator report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentOrReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial statement, third party credit report, bankruptcy filing or a securities regulator report."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOtherDocumentOrReport = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentOrReport";
			definition = "Financial statement, third party credit report, bankruptcy filing or a securities regulator report.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER6";
		}
	};
	/**
	 * Standardised industry coding system for the entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standardised industry coding system for the entity."</li>
	 * </ul>
	 */
	public static final MMCode mmStandardised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standardised";
			definition = "Standardised industry coding system for the entity.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER7";
		}
	};
	/**
	 * Publicly available information for the entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
	 * CRSFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicInformationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Publicly available information for the entity."</li>
	 * </ul>
	 */
	public static final MMCode mmPublicInformationEntity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicInformationEntity";
			definition = "Publicly available information for the entity.";
			owner_lazy = () -> CRSFormTypeCode.mmObject();
			codeName = "CER8";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSFormTypeCode";
				definition = "Specifies the type of Common Reporting Standard  (CRS) form.";
				code_lazy = () -> Arrays.asList(CRSFormTypeCode.mmSelfCertificationSeparateDocument, CRSFormTypeCode.mmSelfCertificationWithAccountOpeningContract, CRSFormTypeCode.mmCertificateOfResidence,
						CRSFormTypeCode.mmCertificateIdentificationGovernment, CRSFormTypeCode.mmOfficialDocumentGovernmentForEntity, CRSFormTypeCode.mmOtherDocumentOrReport, CRSFormTypeCode.mmStandardised,
						CRSFormTypeCode.mmPublicInformationEntity);
				derivation_lazy = () -> Arrays.asList(CRSFormType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}