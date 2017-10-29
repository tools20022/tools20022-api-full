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
import com.tools20022.repository.codeset.CRSFormTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of Common Reporting Standard (CRS) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
 * CRSFormTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#CertificateIdentificationGovernment
 * CRSFormType1Code.CertificateIdentificationGovernment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#CertificateOfResidence
 * CRSFormType1Code.CertificateOfResidence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#OfficialDocumentGovernmentForEntity
 * CRSFormType1Code.OfficialDocumentGovernmentForEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#OtherDocumentOrReport
 * CRSFormType1Code.OtherDocumentOrReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#PublicInformationEntity
 * CRSFormType1Code.PublicInformationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#SelfCertificationSeparateDocument
 * CRSFormType1Code.SelfCertificationSeparateDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#SelfCertificationWithAccountOpeningContract
 * CRSFormType1Code.SelfCertificationWithAccountOpeningContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#Standardised
 * CRSFormType1Code.Standardised}</li>
 * </ul>
 * </li>
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
 * "CRSFormType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of Common Reporting Standard  (CRS) form."</li>
 * </ul>
 */
public class CRSFormType1Code extends CRSFormTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentificationGovernment"</li>
	 * </ul>
	 */
	public static final MMCode CertificateIdentificationGovernment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentificationGovernment";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfResidence"</li>
	 * </ul>
	 */
	public static final MMCode CertificateOfResidence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfResidence";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialDocumentGovernmentForEntity"</li>
	 * </ul>
	 */
	public static final MMCode OfficialDocumentGovernmentForEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialDocumentGovernmentForEntity";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentOrReport"</li>
	 * </ul>
	 */
	public static final MMCode OtherDocumentOrReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentOrReport";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicInformationEntity"</li>
	 * </ul>
	 */
	public static final MMCode PublicInformationEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicInformationEntity";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationSeparateDocument"</li>
	 * </ul>
	 */
	public static final MMCode SelfCertificationSeparateDocument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationSeparateDocument";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationWithAccountOpeningContract"</li>
	 * </ul>
	 */
	public static final MMCode SelfCertificationWithAccountOpeningContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationWithAccountOpeningContract";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardised"</li>
	 * </ul>
	 */
	public static final MMCode Standardised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standardised";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CRSFormType1Code";
				definition = "Specifies the type of Common Reporting Standard  (CRS) form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSFormType1Code.CertificateIdentificationGovernment, com.tools20022.repository.codeset.CRSFormType1Code.CertificateOfResidence,
						com.tools20022.repository.codeset.CRSFormType1Code.OfficialDocumentGovernmentForEntity, com.tools20022.repository.codeset.CRSFormType1Code.OtherDocumentOrReport,
						com.tools20022.repository.codeset.CRSFormType1Code.PublicInformationEntity, com.tools20022.repository.codeset.CRSFormType1Code.SelfCertificationSeparateDocument,
						com.tools20022.repository.codeset.CRSFormType1Code.SelfCertificationWithAccountOpeningContract, com.tools20022.repository.codeset.CRSFormType1Code.Standardised);
				trace_lazy = () -> CRSFormTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}