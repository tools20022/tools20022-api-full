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
import com.tools20022.repository.codeset.CRSFormType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of Common Reporting Standard (CRS) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
 * CRSFormTypeCode}</li>
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
 * definition} = "Specifies the type of Common Reporting Standard (CRS) form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CRSFormType1Code extends MMCode {

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
	public static final CRSFormType1Code CertificateIdentificationGovernment = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentificationGovernment";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.CertificateIdentificationGovernment.getCodeName().orElse(name);
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
	public static final CRSFormType1Code CertificateOfResidence = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfResidence";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.CertificateOfResidence.getCodeName().orElse(name);
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
	public static final CRSFormType1Code OfficialDocumentGovernmentForEntity = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialDocumentGovernmentForEntity";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.OfficialDocumentGovernmentForEntity.getCodeName().orElse(name);
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
	public static final CRSFormType1Code OtherDocumentOrReport = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentOrReport";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.OtherDocumentOrReport.getCodeName().orElse(name);
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
	public static final CRSFormType1Code PublicInformationEntity = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicInformationEntity";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.PublicInformationEntity.getCodeName().orElse(name);
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
	public static final CRSFormType1Code SelfCertificationSeparateDocument = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationSeparateDocument";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.SelfCertificationSeparateDocument.getCodeName().orElse(name);
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
	public static final CRSFormType1Code SelfCertificationWithAccountOpeningContract = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationWithAccountOpeningContract";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.SelfCertificationWithAccountOpeningContract.getCodeName().orElse(name);
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
	public static final CRSFormType1Code Standardised = new CRSFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standardised";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSFormType1Code.mmObject();
			codeName = CRSFormTypeCode.Standardised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CRSFormType1Code> codesByName = new LinkedHashMap<>();

	protected CRSFormType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSFormType1Code";
				definition = "Specifies the type of Common Reporting Standard (CRS) form.";
				trace_lazy = () -> CRSFormTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSFormType1Code.CertificateIdentificationGovernment, com.tools20022.repository.codeset.CRSFormType1Code.CertificateOfResidence,
						com.tools20022.repository.codeset.CRSFormType1Code.OfficialDocumentGovernmentForEntity, com.tools20022.repository.codeset.CRSFormType1Code.OtherDocumentOrReport,
						com.tools20022.repository.codeset.CRSFormType1Code.PublicInformationEntity, com.tools20022.repository.codeset.CRSFormType1Code.SelfCertificationSeparateDocument,
						com.tools20022.repository.codeset.CRSFormType1Code.SelfCertificationWithAccountOpeningContract, com.tools20022.repository.codeset.CRSFormType1Code.Standardised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CertificateIdentificationGovernment.getCodeName().get(), CertificateIdentificationGovernment);
		codesByName.put(CertificateOfResidence.getCodeName().get(), CertificateOfResidence);
		codesByName.put(OfficialDocumentGovernmentForEntity.getCodeName().get(), OfficialDocumentGovernmentForEntity);
		codesByName.put(OtherDocumentOrReport.getCodeName().get(), OtherDocumentOrReport);
		codesByName.put(PublicInformationEntity.getCodeName().get(), PublicInformationEntity);
		codesByName.put(SelfCertificationSeparateDocument.getCodeName().get(), SelfCertificationSeparateDocument);
		codesByName.put(SelfCertificationWithAccountOpeningContract.getCodeName().get(), SelfCertificationWithAccountOpeningContract);
		codesByName.put(Standardised.getCodeName().get(), Standardised);
	}

	public static CRSFormType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CRSFormType1Code[] values() {
		CRSFormType1Code[] values = new CRSFormType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CRSFormType1Code> {
		@Override
		public CRSFormType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CRSFormType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}