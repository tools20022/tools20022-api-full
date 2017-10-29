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
import com.tools20022.repository.codeset.ContentType2Code;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.ContentInformationType15#ContentType
 * ContentInformationType15.ContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType15#AuthenticatedData
 * ContentInformationType15.AuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01#SecurityTrailer
 * ATMReconciliationAdviceV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01#SecurityTrailer
 * ATMReconciliationAcknowledgementV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#SecurityTrailer
 * HostToATMAcknowledgementV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01#SecurityTrailer
 * ATMDiagnosticResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#SecurityTrailer
 * ATMDiagnosticRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#SecurityTrailer
 * HostToATMRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV01#SecurityTrailer
 * ATMInquiryResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV01#SecurityTrailer
 * ATMInquiryRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV01#SecurityTrailer
 * ATMCompletionAdviceV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#SecurityTrailer
 * ATMWithdrawalResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01#SecurityTrailer
 * ATMCompletionAcknowledgementV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01#SecurityTrailer
 * ATMWithdrawalCompletionAdviceV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#SecurityTrailer
 * ATMWithdrawalCompletionAcknowledgementV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV01#SecurityTrailer
 * ATMWithdrawalRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV01#SecurityTrailer
 * ATMPINManagementRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV01#SecurityTrailer
 * ATMPINManagementResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementResponse#SecurityTrailer
 * NetworkManagementResponse.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialResponse#SecurityTrailer
 * AcquirerFinancialResponse.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation#SecurityTrailer
 * AcquirerReversalInitiation.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation#SecurityTrailer
 * AcquirerAuthorisationInitiation.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.ReconciliationInitiation#SecurityTrailer
 * ReconciliationInitiation.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationResponse#SecurityTrailer
 * AcquirerAuthorisationResponse.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementInitiation#SecurityTrailer
 * NetworkManagementInitiation.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalResponse#SecurityTrailer
 * AcquirerReversalResponse.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.ReconciliationResponse#SecurityTrailer
 * ReconciliationResponse.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialInitiation#SecurityTrailer
 * AcquirerFinancialInitiation.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV05#SecurityTrailer
 * AcceptorReconciliationRequestV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03#SecurityTrailer
 * AcceptorCurrencyConversionResponseV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV05#SecurityTrailer
 * AcceptorCancellationResponseV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV05#SecurityTrailer
 * AcceptorCancellationRequestV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05#SecurityTrailer
 * AcceptorAuthorisationRequestV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03#SecurityTrailer
 * AcceptorCurrencyConversionRequestV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV05#SecurityTrailer
 * AcceptorCompletionAdviceV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV05#SecurityTrailer
 * AcceptorCompletionAdviceResponseV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05#SecurityTrailer
 * AcceptorDiagnosticRequestV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05#SecurityTrailer
 * AcceptorReconciliationResponseV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV05#SecurityTrailer
 * AcceptorCancellationAdviceResponseV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05#SecurityTrailer
 * AcceptorDiagnosticResponseV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV05#SecurityTrailer
 * AcceptorCancellationAdviceV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV05#SecurityTrailer
 * AcceptorAuthorisationResponseV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01#SecurityTrailer
 * ATMExceptionAcknowledgementV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02#SecurityTrailer
 * ATMWithdrawalRequestV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01#SecurityTrailer
 * ATMExceptionAdviceV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02#SecurityTrailer
 * ATMReconciliationAdviceV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02#SecurityTrailer
 * ATMReconciliationAcknowledgementV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01#SecurityTrailer
 * ATMDepositResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#SecurityTrailer
 * ATMDepositRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#SecurityTrailer
 * ATMWithdrawalCompletionAdviceV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV02#SecurityTrailer
 * ATMInquiryResponseV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#SecurityTrailer
 * ATMDepositCompletionAcknowledgementV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02#SecurityTrailer
 * ATMPINManagementRequestV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#SecurityTrailer
 * ATMTransferRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#SecurityTrailer
 * ATMDiagnosticResponseV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02#SecurityTrailer
 * ATMDiagnosticRequestV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02#SecurityTrailer
 * ATMWithdrawalResponseV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02#SecurityTrailer
 * ATMWithdrawalCompletionAcknowledgementV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02#SecurityTrailer
 * ATMPINManagementResponseV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#SecurityTrailer
 * ATMDepositCompletionAdviceV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV02#SecurityTrailer
 * ATMInquiryRequestV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02#SecurityTrailer
 * ATMCompletionAcknowledgementV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02#SecurityTrailer
 * ATMCompletionAdviceV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferResponseV01#SecurityTrailer
 * ATMTransferResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV06#SecurityTrailer
 * AcceptorAuthorisationResponseV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06#SecurityTrailer
 * AcceptorAuthorisationRequestV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV06#SecurityTrailer
 * AcceptorCancellationRequestV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV06#SecurityTrailer
 * AcceptorCompletionAdviceResponseV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06#SecurityTrailer
 * AcceptorCancellationAdviceV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04#SecurityTrailer
 * AcceptorCurrencyConversionResponseV04.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV06#SecurityTrailer
 * AcceptorCompletionAdviceV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV04#SecurityTrailer
 * AcceptorCurrencyConversionRequestV04.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06#SecurityTrailer
 * AcceptorCancellationAdviceResponseV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV06#SecurityTrailer
 * AcceptorCancellationResponseV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV06#SecurityTrailer
 * AcceptorReconciliationRequestV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06#SecurityTrailer
 * AcceptorDiagnosticRequestV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01#SecurityTrailer
 * AcceptorCurrencyConversionAdviceResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceV01#SecurityTrailer
 * AcceptorCurrencyConversionAdviceV01.SecurityTrailer}</li>
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
 * "ContentInformationType15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing authenticated data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType11
 * ContentInformationType11}</li>
 * </ul>
 */
public class ContentInformationType15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of data protection.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#ContentType
	 * ContentInformationType11.ContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType15.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType11.ContentType;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}
	};
	/**
	 * Data protection by a message authentication code (MAC).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by a message authentication code (MAC)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#AuthenticatedData
	 * ContentInformationType11.AuthenticatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType15.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType11.AuthenticatedData;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AuthenticatedData4.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType15.ContentType, com.tools20022.repository.msg.ContentInformationType15.AuthenticatedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.ATMReconciliationAdviceV01.SecurityTrailer, com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01.SecurityTrailer,
						com.tools20022.repository.area.caam.HostToATMAcknowledgementV01.SecurityTrailer, com.tools20022.repository.area.caam.ATMDiagnosticResponseV01.SecurityTrailer,
						com.tools20022.repository.area.caam.ATMDiagnosticRequestV01.SecurityTrailer, com.tools20022.repository.area.caam.HostToATMRequestV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMInquiryResponseV01.SecurityTrailer, com.tools20022.repository.area.catp.ATMInquiryRequestV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMCompletionAdviceV01.SecurityTrailer, com.tools20022.repository.area.catp.ATMWithdrawalResponseV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01.SecurityTrailer, com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01.SecurityTrailer, com.tools20022.repository.area.catp.ATMWithdrawalRequestV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMPINManagementRequestV01.SecurityTrailer, com.tools20022.repository.area.catp.ATMPINManagementResponseV01.SecurityTrailer,
						com.tools20022.repository.area.cain.NetworkManagementResponse.SecurityTrailer, com.tools20022.repository.area.cain.AcquirerFinancialResponse.SecurityTrailer,
						com.tools20022.repository.area.cain.AcquirerReversalInitiation.SecurityTrailer, com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation.SecurityTrailer,
						com.tools20022.repository.area.cain.ReconciliationInitiation.SecurityTrailer, com.tools20022.repository.area.cain.AcquirerAuthorisationResponse.SecurityTrailer,
						com.tools20022.repository.area.cain.NetworkManagementInitiation.SecurityTrailer, com.tools20022.repository.area.cain.AcquirerReversalResponse.SecurityTrailer,
						com.tools20022.repository.area.cain.ReconciliationResponse.SecurityTrailer, com.tools20022.repository.area.cain.AcquirerFinancialInitiation.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV05.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCancellationResponseV05.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCancellationRequestV05.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV05.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV05.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV05.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV05.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV05.SecurityTrailer,
						com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01.SecurityTrailer, com.tools20022.repository.area.catp.ATMWithdrawalRequestV02.SecurityTrailer,
						com.tools20022.repository.area.caam.ATMExceptionAdviceV01.SecurityTrailer, com.tools20022.repository.area.caam.ATMReconciliationAdviceV02.SecurityTrailer,
						com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02.SecurityTrailer, com.tools20022.repository.area.catp.ATMDepositResponseV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMDepositRequestV01.SecurityTrailer, com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMInquiryResponseV02.SecurityTrailer, com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMPINManagementRequestV02.SecurityTrailer, com.tools20022.repository.area.catp.ATMTransferRequestV01.SecurityTrailer,
						com.tools20022.repository.area.caam.ATMDiagnosticResponseV02.SecurityTrailer, com.tools20022.repository.area.caam.ATMDiagnosticRequestV02.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMWithdrawalResponseV02.SecurityTrailer, com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMPINManagementResponseV02.SecurityTrailer, com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMInquiryRequestV02.SecurityTrailer, com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02.SecurityTrailer,
						com.tools20022.repository.area.catp.ATMCompletionAdviceV02.SecurityTrailer, com.tools20022.repository.area.catp.ATMTransferResponseV01.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV06.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCancellationRequestV06.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV06.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV06.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV04.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCancellationResponseV06.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV06.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceV01.SecurityTrailer);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType15";
				definition = "General cryptographic message syntax (CMS) containing authenticated data.";
				previousVersion_lazy = () -> ContentInformationType11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}