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

package com.tools20022.repository.area.tsrv;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesLatestVersion;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.Undertaking3;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The UndertakingIssuance message is sent (and is thus issued) by the party
 * issuing the undertaking to the beneficiary. The message may be sent either to
 * the beneficiary directly or via an advising party. The undertaking could be a
 * demand guarantee, standby letter of credit, or counter-undertaking
 * (counter-guarantee or counter-standby). It contains details on the applicable
 * rules, expiry date, the amount, required documents, and terms and conditions
 * of the undertaking. The message constitutes an operative financial
 * instrument.<br>
 * Under the United Nations Convention on Independent Guarantees and Stand-by
 * Letters of Credit (http://www.uncitral.org), 1996, Article 2,
 * "an undertaking is an independent commitment, known in international practice as an independent guarantee or as a standby letter of credit, given by a bank or other institution or person ('guarantor/issuer') to pay to the beneficiary a certain or determinable amount upon simple demand or upon demand accompanied by other documents, in conformity with the terms and any documentary conditions of the undertaking, indicating, or from which it is to be inferred, that payment is due because of a default in the performance of an obligation, or because of another contingency, or for money borrowed or advanced, or on account of any mature indebtedness undertaken by the principal/applicant or another person"
 * .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.001.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01#mmUndertakingIssuanceDetails
 * UndertakingIssuanceV01.mmUndertakingIssuanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01#mmBankToBeneficiaryInformation
 * UndertakingIssuanceV01.mmBankToBeneficiaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01#mmBankToBankInformation
 * UndertakingIssuanceV01.mmBankToBankInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01#mmDigitalSignature
 * UndertakingIssuanceV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgIssnc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingIssuanceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingIssuance message is sent (and is thus issued) by the party issuing the undertaking to the beneficiary. The message may be sent either to the beneficiary directly or via an advising party. The undertaking could be a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). It contains details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking. The message constitutes an operative financial instrument.\r\nUnder the United Nations Convention on Independent Guarantees and Stand-by Letters of Credit (http://www.uncitral.org), 1996, Article 2, \"an undertaking is an independent commitment, known in international practice as an independent guarantee or as a standby letter of credit, given by a bank or other institution or person ('guarantor/issuer') to pay to the beneficiary a certain or determinable amount upon simple demand or upon demand accompanied by other documents, in conformity with the terms and any documentary conditions of the undertaking, indicating, or from which it is to be inferred, that payment is due because of a default in the performance of an obligation, or because of another contingency, or for money borrowed or advanced, or on account of any mature indebtedness undertaken by the principal/applicant or another person\"."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant1Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintApplicant1Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant2Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintApplicant2Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant3Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintApplicant3Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant4Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintApplicant4Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant5Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintApplicant5Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant6Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintApplicant6Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType1Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintIssuanceType1Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType2Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintIssuanceType2Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType3Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintIssuanceType3Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType4Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintIssuanceType4Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType5Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintIssuanceType5Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType6Rule#for_tsrv_UndertakingIssuanceV01
 * ConstraintIssuanceType6Rule.for_tsrv_UndertakingIssuanceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingIssuanceV01", propOrder = {"undertakingIssuanceDetails", "bankToBeneficiaryInformation", "bankToBankInformation", "digitalSignature"})
public class UndertakingIssuanceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgIssncDtls", required = true)
	protected Undertaking3 undertakingIssuanceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Undertaking3
	 * Undertaking3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgIssncDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceV01, Undertaking3> mmUndertakingIssuanceDetails = new MMMessageBuildingBlock<UndertakingIssuanceV01, Undertaking3>() {
		{
			xmlTag = "UdrtkgIssncDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuanceDetails";
			definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Undertaking3.mmObject();
		}

		@Override
		public Undertaking3 getValue(UndertakingIssuanceV01 obj) {
			return obj.getUndertakingIssuanceDetails();
		}

		@Override
		public void setValue(UndertakingIssuanceV01 obj, Undertaking3 value) {
			obj.setUndertakingIssuanceDetails(value);
		}
	};
	@XmlElement(name = "BkToBnfcryInf")
	protected List<Max2000Text> bankToBeneficiaryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkToBnfcryInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankToBeneficiaryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information specific to the bank-to-beneficiary communication."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceV01, List<Max2000Text>> mmBankToBeneficiaryInformation = new MMMessageBuildingBlock<UndertakingIssuanceV01, List<Max2000Text>>() {
		{
			xmlTag = "BkToBnfcryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankToBeneficiaryInformation";
			definition = "Additional information specific to the bank-to-beneficiary communication.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(UndertakingIssuanceV01 obj) {
			return obj.getBankToBeneficiaryInformation();
		}

		@Override
		public void setValue(UndertakingIssuanceV01 obj, List<Max2000Text> value) {
			obj.setBankToBeneficiaryInformation(value);
		}
	};
	@XmlElement(name = "BkToBkInf")
	protected List<Max2000Text> bankToBankInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkToBkInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankToBankInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information specific to the bank-to-bank communication."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceV01, List<Max2000Text>> mmBankToBankInformation = new MMMessageBuildingBlock<UndertakingIssuanceV01, List<Max2000Text>>() {
		{
			xmlTag = "BkToBkInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankToBankInformation";
			definition = "Additional information specific to the bank-to-bank communication.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(UndertakingIssuanceV01 obj) {
			return obj.getBankToBankInformation();
		}

		@Override
		public void setValue(UndertakingIssuanceV01 obj, List<Max2000Text> value) {
			obj.setBankToBankInformation(value);
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected List<PartyAndSignature2> digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature of the undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingIssuanceV01, List<PartyAndSignature2>> mmDigitalSignature = new MMMessageBuildingBlock<UndertakingIssuanceV01, List<PartyAndSignature2>>() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the undertaking.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		@Override
		public List<PartyAndSignature2> getValue(UndertakingIssuanceV01 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(UndertakingIssuanceV01 obj, List<PartyAndSignature2> value) {
			obj.setDigitalSignature(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintApplicant1Rule.for_tsrv_UndertakingIssuanceV01,
						com.tools20022.repository.constraints.ConstraintApplicant2Rule.for_tsrv_UndertakingIssuanceV01, com.tools20022.repository.constraints.ConstraintApplicant3Rule.for_tsrv_UndertakingIssuanceV01,
						com.tools20022.repository.constraints.ConstraintApplicant4Rule.for_tsrv_UndertakingIssuanceV01, com.tools20022.repository.constraints.ConstraintApplicant5Rule.for_tsrv_UndertakingIssuanceV01,
						com.tools20022.repository.constraints.ConstraintApplicant6Rule.for_tsrv_UndertakingIssuanceV01, com.tools20022.repository.constraints.ConstraintIssuanceType1Rule.for_tsrv_UndertakingIssuanceV01,
						com.tools20022.repository.constraints.ConstraintIssuanceType2Rule.for_tsrv_UndertakingIssuanceV01, com.tools20022.repository.constraints.ConstraintIssuanceType3Rule.for_tsrv_UndertakingIssuanceV01,
						com.tools20022.repository.constraints.ConstraintIssuanceType4Rule.for_tsrv_UndertakingIssuanceV01, com.tools20022.repository.constraints.ConstraintIssuanceType5Rule.for_tsrv_UndertakingIssuanceV01,
						com.tools20022.repository.constraints.ConstraintIssuanceType6Rule.for_tsrv_UndertakingIssuanceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingIssuanceV01";
				definition = "The UndertakingIssuance message is sent (and is thus issued) by the party issuing the undertaking to the beneficiary. The message may be sent either to the beneficiary directly or via an advising party. The undertaking could be a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). It contains details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking. The message constitutes an operative financial instrument.\r\nUnder the United Nations Convention on Independent Guarantees and Stand-by Letters of Credit (http://www.uncitral.org), 1996, Article 2, \"an undertaking is an independent commitment, known in international practice as an independent guarantee or as a standby letter of credit, given by a bank or other institution or person ('guarantor/issuer') to pay to the beneficiary a certain or determinable amount upon simple demand or upon demand accompanied by other documents, in conformity with the terms and any documentary conditions of the undertaking, indicating, or from which it is to be inferred, that payment is due because of a default in the performance of an obligation, or because of another contingency, or for money borrowed or advanced, or on account of any mature indebtedness undertaken by the principal/applicant or another person\".";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "UdrtkgIssnc";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingIssuanceV01.mmUndertakingIssuanceDetails,
						com.tools20022.repository.area.tsrv.UndertakingIssuanceV01.mmBankToBeneficiaryInformation, com.tools20022.repository.area.tsrv.UndertakingIssuanceV01.mmBankToBankInformation,
						com.tools20022.repository.area.tsrv.UndertakingIssuanceV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingIssuanceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking3 getUndertakingIssuanceDetails() {
		return undertakingIssuanceDetails;
	}

	public UndertakingIssuanceV01 setUndertakingIssuanceDetails(Undertaking3 undertakingIssuanceDetails) {
		this.undertakingIssuanceDetails = Objects.requireNonNull(undertakingIssuanceDetails);
		return this;
	}

	public List<Max2000Text> getBankToBeneficiaryInformation() {
		return bankToBeneficiaryInformation == null ? bankToBeneficiaryInformation = new ArrayList<>() : bankToBeneficiaryInformation;
	}

	public UndertakingIssuanceV01 setBankToBeneficiaryInformation(List<Max2000Text> bankToBeneficiaryInformation) {
		this.bankToBeneficiaryInformation = Objects.requireNonNull(bankToBeneficiaryInformation);
		return this;
	}

	public List<Max2000Text> getBankToBankInformation() {
		return bankToBankInformation == null ? bankToBankInformation = new ArrayList<>() : bankToBankInformation;
	}

	public UndertakingIssuanceV01 setBankToBankInformation(List<Max2000Text> bankToBankInformation) {
		this.bankToBankInformation = Objects.requireNonNull(bankToBankInformation);
		return this;
	}

	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public UndertakingIssuanceV01 setDigitalSignature(List<PartyAndSignature2> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01")
	static public class Document {
		@XmlElement(name = "UdrtkgIssnc", required = true)
		public UndertakingIssuanceV01 messageBody;
	}
}