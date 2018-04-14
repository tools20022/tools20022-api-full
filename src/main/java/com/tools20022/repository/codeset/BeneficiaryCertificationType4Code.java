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
import com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of certification required.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#AccreditedInvestor
 * BeneficiaryCertificationType4Code.AccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#DomicileCountry
 * BeneficiaryCertificationType4Code.DomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#NonDomicileCountry
 * BeneficiaryCertificationType4Code.NonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#FullBeneficialOwnerBreakdown
 * BeneficiaryCertificationType4Code.FullBeneficialOwnerBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#NonCompany
 * BeneficiaryCertificationType4Code.NonCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#QIBCertification
 * BeneficiaryCertificationType4Code.QIBCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#TaxRateBreakdown
 * BeneficiaryCertificationType4Code.TaxRateBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#BeneficialOwnerPaperwork
 * BeneficiaryCertificationType4Code.BeneficialOwnerPaperwork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#ICSDParticipantBreakdown
 * BeneficiaryCertificationType4Code.ICSDParticipantBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#FractionBreakdown
 * BeneficiaryCertificationType4Code.FractionBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
 * BeneficiaryCertificationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficiaryCertificationType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of certification required."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType2Code
 * BeneficiaryCertificationType2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BeneficiaryCertificationType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccreditedInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code AccreditedInvestor = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccreditedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.AccreditedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code DomicileCountry = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomicileCountry";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.DomicileCountry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code NonDomicileCountry = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.NonDomicileCountry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullBeneficialOwnerBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code FullBeneficialOwnerBreakdown = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullBeneficialOwnerBreakdown";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.FullBeneficialOwnerBreakdown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code NonCompany = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.NonCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QIBCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code QIBCertification = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QIBCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.QIBCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code TaxRateBreakdown = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRateBreakdown";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.TaxRateBreakdown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerPaperwork"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code BeneficialOwnerPaperwork = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerPaperwork";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.BeneficialOwnerPaperwork.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICSDParticipantBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code ICSDParticipantBreakdown = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICSDParticipantBreakdown";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.ICSDParticipantBreakdown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType4Code FractionBreakdown = new BeneficiaryCertificationType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionBreakdown";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.FractionBreakdown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BeneficiaryCertificationType4Code> codesByName = new LinkedHashMap<>();

	protected BeneficiaryCertificationType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationType4Code";
				definition = "Specifies the type of certification required.";
				previousVersion_lazy = () -> BeneficiaryCertificationType2Code.mmObject();
				trace_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.AccreditedInvestor, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.DomicileCountry,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.NonDomicileCountry, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.FullBeneficialOwnerBreakdown,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.NonCompany, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.QIBCertification,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.TaxRateBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.BeneficialOwnerPaperwork,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.ICSDParticipantBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.FractionBreakdown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccreditedInvestor.getCodeName().get(), AccreditedInvestor);
		codesByName.put(DomicileCountry.getCodeName().get(), DomicileCountry);
		codesByName.put(NonDomicileCountry.getCodeName().get(), NonDomicileCountry);
		codesByName.put(FullBeneficialOwnerBreakdown.getCodeName().get(), FullBeneficialOwnerBreakdown);
		codesByName.put(NonCompany.getCodeName().get(), NonCompany);
		codesByName.put(QIBCertification.getCodeName().get(), QIBCertification);
		codesByName.put(TaxRateBreakdown.getCodeName().get(), TaxRateBreakdown);
		codesByName.put(BeneficialOwnerPaperwork.getCodeName().get(), BeneficialOwnerPaperwork);
		codesByName.put(ICSDParticipantBreakdown.getCodeName().get(), ICSDParticipantBreakdown);
		codesByName.put(FractionBreakdown.getCodeName().get(), FractionBreakdown);
	}

	public static BeneficiaryCertificationType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BeneficiaryCertificationType4Code[] values() {
		BeneficiaryCertificationType4Code[] values = new BeneficiaryCertificationType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BeneficiaryCertificationType4Code> {
		@Override
		public BeneficiaryCertificationType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BeneficiaryCertificationType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}