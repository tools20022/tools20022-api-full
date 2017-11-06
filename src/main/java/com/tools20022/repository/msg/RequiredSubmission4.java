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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.TradeCertificateType1Code;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.TradeCertificate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the details relative to the submission of the certificate data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmSubmitter
 * RequiredSubmission4.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmCertificateType
 * RequiredSubmission4.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchIssuer
 * RequiredSubmission4.mmMatchIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchIssueDate
 * RequiredSubmission4.mmMatchIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchInspectionDate
 * RequiredSubmission4.mmMatchInspectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmAuthorisedInspectorIndicator
 * RequiredSubmission4.mmAuthorisedInspectorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchConsignee
 * RequiredSubmission4.mmMatchConsignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchManufacturer
 * RequiredSubmission4.mmMatchManufacturer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmLineItemIdentification
 * RequiredSubmission4.mmLineItemIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
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
 * "RequiredSubmission4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details relative to the submission of the certificate data set."
 * </li>
 * </ul>
 */
public class RequiredSubmission4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.BICIdentification1> submitter;
	/**
	 * Specifies with party(ies) is authorised to submit the data set as part of
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Submitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submitter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies with party(ies) is authorised to submit the data set as part of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmitter = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "Submitr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "Specifies with party(ies) is authorised to submit the data set as part of the transaction.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected TradeCertificateType1Code certificateType;
	/**
	 * Specifies the type of the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateType1Code
	 * TradeCertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmCertificateType
	 * TradeCertificate.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmCertificateType;
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Specifies the type of the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeCertificateType1Code.mmObject();
		}
	};
	protected PartyIdentification27 matchIssuer;
	/**
	 * Specifies if the issuer must be matched as part of the validation of the
	 * data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification27
	 * PartyIdentification27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchIssr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssuer";
			definition = "Specifies if the issuer must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification27.mmObject();
		}
	};
	protected YesNoIndicator matchIssueDate;
	/**
	 * Specifies if the issue date must be matched as part of the validation of
	 * the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issue date must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchIssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchIsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssueDate";
			definition = "Specifies if the issue date must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator matchInspectionDate;
	/**
	 * Specifies if the inspection date must be matched as part of the
	 * validation of the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchInspctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchInspectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the inspection date must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchInspectionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchInspctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchInspectionDate";
			definition = "Specifies if the inspection date must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator authorisedInspectorIndicator;
	/**
	 * Specifies if the indication of an authorised inspector must be present as
	 * part of the validation of the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrsdInspctrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedInspectorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the indication of an authorised inspector must be present as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisedInspectorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdInspctrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedInspectorIndicator";
			definition = "Specifies if the indication of an authorised inspector must be present as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator matchConsignee;
	/**
	 * Specifies if the consignee must be matched as part of the validation of
	 * the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchConsgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchConsignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the consignee must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchConsignee = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchConsgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchConsignee";
			definition = "Specifies if the consignee must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PartyIdentification27 matchManufacturer;
	/**
	 * Specifies if the manufacturer must be matched as part of the validation
	 * of the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification27
	 * PartyIdentification27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchManfctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchManufacturer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the manufacturer must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchManufacturer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchManfctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchManufacturer";
			definition = "Specifies if the manufacturer must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification27.mmObject();
		}
	};
	protected List<Max70Text> lineItemIdentification;
	/**
	 * Specifies if the certificate data set is required in relation to specific
	 * line items, and which line items.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmIdentification
	 * LineItem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the certificate data set is required in relation to specific line items, and which line items."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLineItemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.LineItem.mmIdentification;
			componentContext_lazy = () -> RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "LineItmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemIdentification";
			definition = "Specifies if the certificate data set is required in relation to specific line items, and which line items.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequiredSubmission4.mmSubmitter, com.tools20022.repository.msg.RequiredSubmission4.mmCertificateType,
						com.tools20022.repository.msg.RequiredSubmission4.mmMatchIssuer, com.tools20022.repository.msg.RequiredSubmission4.mmMatchIssueDate, com.tools20022.repository.msg.RequiredSubmission4.mmMatchInspectionDate,
						com.tools20022.repository.msg.RequiredSubmission4.mmAuthorisedInspectorIndicator, com.tools20022.repository.msg.RequiredSubmission4.mmMatchConsignee,
						com.tools20022.repository.msg.RequiredSubmission4.mmMatchManufacturer, com.tools20022.repository.msg.RequiredSubmission4.mmLineItemIdentification);
				trace_lazy = () -> TradeCertificate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RequiredSubmission4";
				definition = "Specifies the details relative to the submission of the certificate data set.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<BICIdentification1> getSubmitter() {
		return submitter;
	}

	public void setSubmitter(List<com.tools20022.repository.msg.BICIdentification1> submitter) {
		this.submitter = submitter;
	}

	public TradeCertificateType1Code getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(TradeCertificateType1Code certificateType) {
		this.certificateType = certificateType;
	}

	public PartyIdentification27 getMatchIssuer() {
		return matchIssuer;
	}

	public void setMatchIssuer(com.tools20022.repository.msg.PartyIdentification27 matchIssuer) {
		this.matchIssuer = matchIssuer;
	}

	public YesNoIndicator getMatchIssueDate() {
		return matchIssueDate;
	}

	public void setMatchIssueDate(YesNoIndicator matchIssueDate) {
		this.matchIssueDate = matchIssueDate;
	}

	public YesNoIndicator getMatchInspectionDate() {
		return matchInspectionDate;
	}

	public void setMatchInspectionDate(YesNoIndicator matchInspectionDate) {
		this.matchInspectionDate = matchInspectionDate;
	}

	public YesNoIndicator getAuthorisedInspectorIndicator() {
		return authorisedInspectorIndicator;
	}

	public void setAuthorisedInspectorIndicator(YesNoIndicator authorisedInspectorIndicator) {
		this.authorisedInspectorIndicator = authorisedInspectorIndicator;
	}

	public YesNoIndicator getMatchConsignee() {
		return matchConsignee;
	}

	public void setMatchConsignee(YesNoIndicator matchConsignee) {
		this.matchConsignee = matchConsignee;
	}

	public PartyIdentification27 getMatchManufacturer() {
		return matchManufacturer;
	}

	public void setMatchManufacturer(com.tools20022.repository.msg.PartyIdentification27 matchManufacturer) {
		this.matchManufacturer = matchManufacturer;
	}

	public List<Max70Text> getLineItemIdentification() {
		return lineItemIdentification;
	}

	public void setLineItemIdentification(List<Max70Text> lineItemIdentification) {
		this.lineItemIdentification = lineItemIdentification;
	}
}