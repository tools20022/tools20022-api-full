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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.area.caam.*;
import com.tools20022.repository.area.cain.*;
import com.tools20022.repository.area.catp.*;
import com.tools20022.repository.codeset.ContentType2Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AuthenticatedData4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General cryptographic message syntax (CMS) containing authenticated data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType15#mmContentType
 * ContentInformationType15.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType15#mmAuthenticatedData
 * ContentInformationType15.mmAuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01#mmSecurityTrailer
 * ATMReconciliationAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01#mmSecurityTrailer
 * ATMReconciliationAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmSecurityTrailer
 * HostToATMAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01#mmSecurityTrailer
 * ATMDiagnosticResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#mmSecurityTrailer
 * ATMDiagnosticRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#mmSecurityTrailer
 * HostToATMRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV01#mmSecurityTrailer
 * ATMInquiryResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV01#mmSecurityTrailer
 * ATMInquiryRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV01#mmSecurityTrailer
 * ATMCompletionAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmSecurityTrailer
 * ATMWithdrawalResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01#mmSecurityTrailer
 * ATMCompletionAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01#mmSecurityTrailer
 * ATMWithdrawalCompletionAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmSecurityTrailer
 * ATMWithdrawalCompletionAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV01#mmSecurityTrailer
 * ATMWithdrawalRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV01#mmSecurityTrailer
 * ATMPINManagementRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV01#mmSecurityTrailer
 * ATMPINManagementResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementResponse#mmSecurityTrailer
 * NetworkManagementResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialResponse#mmSecurityTrailer
 * AcquirerFinancialResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation#mmSecurityTrailer
 * AcquirerReversalInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation#mmSecurityTrailer
 * AcquirerAuthorisationInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.ReconciliationInitiation#mmSecurityTrailer
 * ReconciliationInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationResponse#mmSecurityTrailer
 * AcquirerAuthorisationResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementInitiation#mmSecurityTrailer
 * NetworkManagementInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalResponse#mmSecurityTrailer
 * AcquirerReversalResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.ReconciliationResponse#mmSecurityTrailer
 * ReconciliationResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialInitiation#mmSecurityTrailer
 * AcquirerFinancialInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV05#mmSecurityTrailer
 * AcceptorReconciliationRequestV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03#mmSecurityTrailer
 * AcceptorCurrencyConversionResponseV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV05#mmSecurityTrailer
 * AcceptorCancellationResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV05#mmSecurityTrailer
 * AcceptorCancellationRequestV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05#mmSecurityTrailer
 * AcceptorAuthorisationRequestV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03#mmSecurityTrailer
 * AcceptorCurrencyConversionRequestV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV05#mmSecurityTrailer
 * AcceptorCompletionAdviceV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV05#mmSecurityTrailer
 * AcceptorCompletionAdviceResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05#mmSecurityTrailer
 * AcceptorDiagnosticRequestV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05#mmSecurityTrailer
 * AcceptorReconciliationResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV05#mmSecurityTrailer
 * AcceptorCancellationAdviceResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05#mmSecurityTrailer
 * AcceptorDiagnosticResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV05#mmSecurityTrailer
 * AcceptorCancellationAdviceV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV05#mmSecurityTrailer
 * AcceptorAuthorisationResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01#mmSecurityTrailer
 * ATMExceptionAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02#mmSecurityTrailer
 * ATMWithdrawalRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01#mmSecurityTrailer
 * ATMExceptionAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02#mmSecurityTrailer
 * ATMReconciliationAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02#mmSecurityTrailer
 * ATMReconciliationAcknowledgementV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01#mmSecurityTrailer
 * ATMDepositResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmSecurityTrailer
 * ATMDepositRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmSecurityTrailer
 * ATMWithdrawalCompletionAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV02#mmSecurityTrailer
 * ATMInquiryResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmSecurityTrailer
 * ATMDepositCompletionAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02#mmSecurityTrailer
 * ATMPINManagementRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmSecurityTrailer
 * ATMTransferRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#mmSecurityTrailer
 * ATMDiagnosticResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02#mmSecurityTrailer
 * ATMDiagnosticRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02#mmSecurityTrailer
 * ATMWithdrawalResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02#mmSecurityTrailer
 * ATMWithdrawalCompletionAcknowledgementV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02#mmSecurityTrailer
 * ATMPINManagementResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmSecurityTrailer
 * ATMDepositCompletionAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV02#mmSecurityTrailer
 * ATMInquiryRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02#mmSecurityTrailer
 * ATMCompletionAcknowledgementV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02#mmSecurityTrailer
 * ATMCompletionAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferResponseV01#mmSecurityTrailer
 * ATMTransferResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV06#mmSecurityTrailer
 * AcceptorAuthorisationResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06#mmSecurityTrailer
 * AcceptorAuthorisationRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV06#mmSecurityTrailer
 * AcceptorCancellationRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV06#mmSecurityTrailer
 * AcceptorCompletionAdviceResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06#mmSecurityTrailer
 * AcceptorCancellationAdviceV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04#mmSecurityTrailer
 * AcceptorCurrencyConversionResponseV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV06#mmSecurityTrailer
 * AcceptorCompletionAdviceV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV04#mmSecurityTrailer
 * AcceptorCurrencyConversionRequestV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06#mmSecurityTrailer
 * AcceptorCancellationAdviceResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV06#mmSecurityTrailer
 * AcceptorCancellationResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV06#mmSecurityTrailer
 * AcceptorReconciliationRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06#mmSecurityTrailer
 * AcceptorDiagnosticRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01#mmSecurityTrailer
 * AcceptorCurrencyConversionAdviceResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceV01#mmSecurityTrailer
 * AcceptorCurrencyConversionAdviceV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContentInformationType15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing authenticated data."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType16
 * ContentInformationType16}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType11
 * ContentInformationType11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContentInformationType15", propOrder = {"contentType", "authenticatedData"})
public class ContentInformationType15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CnttTp", required = true)
	protected ContentType2Code contentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType16#mmContentType
	 * ContentInformationType16.mmContentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#mmContentType
	 * ContentInformationType11.mmContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContentInformationType15, ContentType2Code> mmContentType = new MMMessageAttribute<ContentInformationType15, ContentType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType15.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType16.mmContentType);
			previousVersion_lazy = () -> ContentInformationType11.mmContentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}

		@Override
		public ContentType2Code getValue(ContentInformationType15 obj) {
			return obj.getContentType();
		}

		@Override
		public void setValue(ContentInformationType15 obj, ContentType2Code value) {
			obj.setContentType(value);
		}
	};
	@XmlElement(name = "AuthntcdData", required = true)
	protected AuthenticatedData4 authenticatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcdData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by a message authentication code (MAC)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType16#mmAuthenticatedData
	 * ContentInformationType16.mmAuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#mmAuthenticatedData
	 * ContentInformationType11.mmAuthenticatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType15, AuthenticatedData4> mmAuthenticatedData = new MMMessageAssociationEnd<ContentInformationType15, AuthenticatedData4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType15.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType16.mmAuthenticatedData);
			previousVersion_lazy = () -> ContentInformationType11.mmAuthenticatedData;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuthenticatedData4.mmObject();
		}

		@Override
		public AuthenticatedData4 getValue(ContentInformationType15 obj) {
			return obj.getAuthenticatedData();
		}

		@Override
		public void setValue(ContentInformationType15 obj, AuthenticatedData4 value) {
			obj.setAuthenticatedData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType15.mmContentType, com.tools20022.repository.msg.ContentInformationType15.mmAuthenticatedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMReconciliationAdviceV01.mmSecurityTrailer, ATMReconciliationAcknowledgementV01.mmSecurityTrailer, HostToATMAcknowledgementV01.mmSecurityTrailer,
						ATMDiagnosticResponseV01.mmSecurityTrailer, ATMDiagnosticRequestV01.mmSecurityTrailer, HostToATMRequestV01.mmSecurityTrailer, ATMInquiryResponseV01.mmSecurityTrailer, ATMInquiryRequestV01.mmSecurityTrailer,
						ATMCompletionAdviceV01.mmSecurityTrailer, ATMWithdrawalResponseV01.mmSecurityTrailer, ATMCompletionAcknowledgementV01.mmSecurityTrailer, ATMWithdrawalCompletionAdviceV01.mmSecurityTrailer,
						ATMWithdrawalCompletionAcknowledgementV01.mmSecurityTrailer, ATMWithdrawalRequestV01.mmSecurityTrailer, ATMPINManagementRequestV01.mmSecurityTrailer, ATMPINManagementResponseV01.mmSecurityTrailer,
						NetworkManagementResponse.mmSecurityTrailer, AcquirerFinancialResponse.mmSecurityTrailer, AcquirerReversalInitiation.mmSecurityTrailer, AcquirerAuthorisationInitiation.mmSecurityTrailer,
						ReconciliationInitiation.mmSecurityTrailer, AcquirerAuthorisationResponse.mmSecurityTrailer, NetworkManagementInitiation.mmSecurityTrailer, AcquirerReversalResponse.mmSecurityTrailer,
						ReconciliationResponse.mmSecurityTrailer, AcquirerFinancialInitiation.mmSecurityTrailer, AcceptorReconciliationRequestV05.mmSecurityTrailer, AcceptorCurrencyConversionResponseV03.mmSecurityTrailer,
						AcceptorCancellationResponseV05.mmSecurityTrailer, AcceptorCancellationRequestV05.mmSecurityTrailer, AcceptorAuthorisationRequestV05.mmSecurityTrailer, AcceptorCurrencyConversionRequestV03.mmSecurityTrailer,
						AcceptorCompletionAdviceV05.mmSecurityTrailer, AcceptorCompletionAdviceResponseV05.mmSecurityTrailer, AcceptorDiagnosticRequestV05.mmSecurityTrailer, AcceptorReconciliationResponseV05.mmSecurityTrailer,
						AcceptorCancellationAdviceResponseV05.mmSecurityTrailer, AcceptorDiagnosticResponseV05.mmSecurityTrailer, AcceptorCancellationAdviceV05.mmSecurityTrailer, AcceptorAuthorisationResponseV05.mmSecurityTrailer,
						ATMExceptionAcknowledgementV01.mmSecurityTrailer, ATMWithdrawalRequestV02.mmSecurityTrailer, ATMExceptionAdviceV01.mmSecurityTrailer, ATMReconciliationAdviceV02.mmSecurityTrailer,
						ATMReconciliationAcknowledgementV02.mmSecurityTrailer, ATMDepositResponseV01.mmSecurityTrailer, ATMDepositRequestV01.mmSecurityTrailer, ATMWithdrawalCompletionAdviceV02.mmSecurityTrailer,
						ATMInquiryResponseV02.mmSecurityTrailer, ATMDepositCompletionAcknowledgementV01.mmSecurityTrailer, ATMPINManagementRequestV02.mmSecurityTrailer, ATMTransferRequestV01.mmSecurityTrailer,
						ATMDiagnosticResponseV02.mmSecurityTrailer, ATMDiagnosticRequestV02.mmSecurityTrailer, ATMWithdrawalResponseV02.mmSecurityTrailer, ATMWithdrawalCompletionAcknowledgementV02.mmSecurityTrailer,
						ATMPINManagementResponseV02.mmSecurityTrailer, ATMDepositCompletionAdviceV01.mmSecurityTrailer, ATMInquiryRequestV02.mmSecurityTrailer, ATMCompletionAcknowledgementV02.mmSecurityTrailer,
						ATMCompletionAdviceV02.mmSecurityTrailer, ATMTransferResponseV01.mmSecurityTrailer, AcceptorAuthorisationResponseV06.mmSecurityTrailer, AcceptorAuthorisationRequestV06.mmSecurityTrailer,
						AcceptorCancellationRequestV06.mmSecurityTrailer, AcceptorCompletionAdviceResponseV06.mmSecurityTrailer, AcceptorCancellationAdviceV06.mmSecurityTrailer, AcceptorCurrencyConversionResponseV04.mmSecurityTrailer,
						AcceptorCompletionAdviceV06.mmSecurityTrailer, AcceptorCurrencyConversionRequestV04.mmSecurityTrailer, AcceptorCancellationAdviceResponseV06.mmSecurityTrailer, AcceptorCancellationResponseV06.mmSecurityTrailer,
						AcceptorReconciliationRequestV06.mmSecurityTrailer, AcceptorDiagnosticRequestV06.mmSecurityTrailer, AcceptorCurrencyConversionAdviceResponseV01.mmSecurityTrailer,
						AcceptorCurrencyConversionAdviceV01.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType15";
				definition = "General cryptographic message syntax (CMS) containing authenticated data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType16.mmObject());
				previousVersion_lazy = () -> ContentInformationType11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType2Code getContentType() {
		return contentType;
	}

	public ContentInformationType15 setContentType(ContentType2Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public AuthenticatedData4 getAuthenticatedData() {
		return authenticatedData;
	}

	public ContentInformationType15 setAuthenticatedData(AuthenticatedData4 authenticatedData) {
		this.authenticatedData = Objects.requireNonNull(authenticatedData);
		return this;
	}
}