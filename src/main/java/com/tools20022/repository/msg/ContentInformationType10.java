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
 * General cryptographic message syntax (CMS) containing encrypted data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType10#ContentType
 * ContentInformationType10.ContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType10#EnvelopedData
 * ContentInformationType10.EnvelopedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01#ProtectedATMReconciliationAdvice
 * ATMReconciliationAdviceV01.ProtectedATMReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01#ProtectedATMReconciliationAcknowledgement
 * ATMReconciliationAcknowledgementV01.ProtectedATMReconciliationAcknowledgement
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#ProtectedHostToATMAcknowledgement
 * HostToATMAcknowledgementV01.ProtectedHostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01#ProtectedATMDiagnosticResponse
 * ATMDiagnosticResponseV01.ProtectedATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#ProtectedATMDiagnosticRequest
 * ATMDiagnosticRequestV01.ProtectedATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01#ProtectedATMKeyDownloadResponse
 * ATMKeyDownloadResponseV01.ProtectedATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01#ProtectedATMDeviceReport
 * ATMDeviceReportV01.ProtectedATMDeviceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#ProtectedHostToATMRequest
 * HostToATMRequestV01.ProtectedHostToATMRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV01#ProtectedATMKeyDownloadRequest
 * ATMKeyDownloadRequestV01.ProtectedATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV01#ProtectedATMDeviceControl
 * ATMDeviceControlV01.ProtectedATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV01#ProtectedATMInquiryResponse
 * ATMInquiryResponseV01.ProtectedATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV01#ProtectedATMInquiryRequest
 * ATMInquiryRequestV01.ProtectedATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV01#ProtectedATMCompletionAdvice
 * ATMCompletionAdviceV01.ProtectedATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#ProtectedATMWithdrawalResponse
 * ATMWithdrawalResponseV01.ProtectedATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01#ProtectedATMCompletionAcknowledgement
 * ATMCompletionAcknowledgementV01.ProtectedATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01#ProtectedATMWithdrawalCompletionAdvice
 * ATMWithdrawalCompletionAdviceV01.ProtectedATMWithdrawalCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#ProtectedATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV01.
 * ProtectedATMWithdrawalCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV01#ProtectedATMWithdrawalRequest
 * ATMWithdrawalRequestV01.ProtectedATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV01#ProtectedATMPINManagementRequest
 * ATMPINManagementRequestV01.ProtectedATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV01#ProtectedATMPINManagementResponse
 * ATMPINManagementResponseV01.ProtectedATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01#ProtectedATMExceptionAcknowledgement
 * ATMExceptionAcknowledgementV01.ProtectedATMExceptionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02#ProtectedATMWithdrawalRequest
 * ATMWithdrawalRequestV02.ProtectedATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01#ProtectedATMExceptionAdvice
 * ATMExceptionAdviceV01.ProtectedATMExceptionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV02#ProtectedATMDeviceControl
 * ATMDeviceControlV02.ProtectedATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02#ProtectedATMReconciliationAdvice
 * ATMReconciliationAdviceV02.ProtectedATMReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02#ProtectedATMReconciliationAcknowledgement
 * ATMReconciliationAcknowledgementV02.ProtectedATMReconciliationAcknowledgement
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01#ProtectedATMDepositResponse
 * ATMDepositResponseV01.ProtectedATMDepositResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#ProtectedATMDepositRequest
 * ATMDepositRequestV01.ProtectedATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#ProtectedATMWithdrawalCompletionAdvice
 * ATMWithdrawalCompletionAdviceV02.ProtectedATMWithdrawalCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV02#ProtectedATMInquiryResponse
 * ATMInquiryResponseV02.ProtectedATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#ProtectedATMDepositCompletionAcknowledgement
 * ATMDepositCompletionAcknowledgementV01.
 * ProtectedATMDepositCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV02#ProtectedATMDeviceReport
 * ATMDeviceReportV02.ProtectedATMDeviceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02#ProtectedATMPINManagementRequest
 * ATMPINManagementRequestV02.ProtectedATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#ProtectedATMTransferRequest
 * ATMTransferRequestV01.ProtectedATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#ProtectedATMDiagnosticResponse
 * ATMDiagnosticResponseV02.ProtectedATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02#ProtectedATMDiagnosticRequest
 * ATMDiagnosticRequestV02.ProtectedATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02#ProtectedATMKeyDownloadRequest
 * ATMKeyDownloadRequestV02.ProtectedATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02#ProtectedATMWithdrawalResponse
 * ATMWithdrawalResponseV02.ProtectedATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02#ProtectedATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV02.
 * ProtectedATMWithdrawalCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02#ProtectedATMPINManagementResponse
 * ATMPINManagementResponseV02.ProtectedATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#ProtectedATMDepositCompletionAdvice
 * ATMDepositCompletionAdviceV01.ProtectedATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV02#ProtectedATMInquiryRequest
 * ATMInquiryRequestV02.ProtectedATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02#ProtectedATMCompletionAcknowledgement
 * ATMCompletionAcknowledgementV02.ProtectedATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02#ProtectedATMCompletionAdvice
 * ATMCompletionAdviceV02.ProtectedATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferResponseV01#ProtectedATMTransferResponse
 * ATMTransferResponseV01.ProtectedATMTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02#ProtectedATMKeyDownloadResponse
 * ATMKeyDownloadResponseV02.ProtectedATMKeyDownloadResponse}</li>
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
 * "ContentInformationType10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing encrypted data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType7
 * ContentInformationType7}</li>
 * </ul>
 */
public class ContentInformationType10 {

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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7#ContentType
	 * ContentInformationType7.ContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType10.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType7.ContentType;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}
	};
	/**
	 * Data protection by encryption or by a digital envelope, with an
	 * encryption key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnvelopedData4
	 * EnvelopedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EnvlpdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data protection by encryption or by a digital envelope, with an encryption key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7#EnvelopedData
	 * ContentInformationType7.EnvelopedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EnvelopedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType10.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption or by a digital envelope, with an encryption key.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType7.EnvelopedData;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EnvelopedData4.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType10.ContentType, com.tools20022.repository.msg.ContentInformationType10.EnvelopedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.ATMReconciliationAdviceV01.ProtectedATMReconciliationAdvice,
						com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01.ProtectedATMReconciliationAcknowledgement, com.tools20022.repository.area.caam.HostToATMAcknowledgementV01.ProtectedHostToATMAcknowledgement,
						com.tools20022.repository.area.caam.ATMDiagnosticResponseV01.ProtectedATMDiagnosticResponse, com.tools20022.repository.area.caam.ATMDiagnosticRequestV01.ProtectedATMDiagnosticRequest,
						com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01.ProtectedATMKeyDownloadResponse, com.tools20022.repository.area.caam.ATMDeviceReportV01.ProtectedATMDeviceReport,
						com.tools20022.repository.area.caam.HostToATMRequestV01.ProtectedHostToATMRequest, com.tools20022.repository.area.caam.ATMKeyDownloadRequestV01.ProtectedATMKeyDownloadRequest,
						com.tools20022.repository.area.caam.ATMDeviceControlV01.ProtectedATMDeviceControl, com.tools20022.repository.area.catp.ATMInquiryResponseV01.ProtectedATMInquiryResponse,
						com.tools20022.repository.area.catp.ATMInquiryRequestV01.ProtectedATMInquiryRequest, com.tools20022.repository.area.catp.ATMCompletionAdviceV01.ProtectedATMCompletionAdvice,
						com.tools20022.repository.area.catp.ATMWithdrawalResponseV01.ProtectedATMWithdrawalResponse, com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01.ProtectedATMCompletionAcknowledgement,
						com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01.ProtectedATMWithdrawalCompletionAdvice,
						com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01.ProtectedATMWithdrawalCompletionAcknowledgement,
						com.tools20022.repository.area.catp.ATMWithdrawalRequestV01.ProtectedATMWithdrawalRequest, com.tools20022.repository.area.catp.ATMPINManagementRequestV01.ProtectedATMPINManagementRequest,
						com.tools20022.repository.area.catp.ATMPINManagementResponseV01.ProtectedATMPINManagementResponse, com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01.ProtectedATMExceptionAcknowledgement,
						com.tools20022.repository.area.catp.ATMWithdrawalRequestV02.ProtectedATMWithdrawalRequest, com.tools20022.repository.area.caam.ATMExceptionAdviceV01.ProtectedATMExceptionAdvice,
						com.tools20022.repository.area.caam.ATMDeviceControlV02.ProtectedATMDeviceControl, com.tools20022.repository.area.caam.ATMReconciliationAdviceV02.ProtectedATMReconciliationAdvice,
						com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02.ProtectedATMReconciliationAcknowledgement, com.tools20022.repository.area.catp.ATMDepositResponseV01.ProtectedATMDepositResponse,
						com.tools20022.repository.area.catp.ATMDepositRequestV01.ProtectedATMDepositRequest, com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02.ProtectedATMWithdrawalCompletionAdvice,
						com.tools20022.repository.area.catp.ATMInquiryResponseV02.ProtectedATMInquiryResponse, com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01.ProtectedATMDepositCompletionAcknowledgement,
						com.tools20022.repository.area.caam.ATMDeviceReportV02.ProtectedATMDeviceReport, com.tools20022.repository.area.catp.ATMPINManagementRequestV02.ProtectedATMPINManagementRequest,
						com.tools20022.repository.area.catp.ATMTransferRequestV01.ProtectedATMTransferRequest, com.tools20022.repository.area.caam.ATMDiagnosticResponseV02.ProtectedATMDiagnosticResponse,
						com.tools20022.repository.area.caam.ATMDiagnosticRequestV02.ProtectedATMDiagnosticRequest, com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02.ProtectedATMKeyDownloadRequest,
						com.tools20022.repository.area.catp.ATMWithdrawalResponseV02.ProtectedATMWithdrawalResponse,
						com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02.ProtectedATMWithdrawalCompletionAcknowledgement,
						com.tools20022.repository.area.catp.ATMPINManagementResponseV02.ProtectedATMPINManagementResponse, com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01.ProtectedATMDepositCompletionAdvice,
						com.tools20022.repository.area.catp.ATMInquiryRequestV02.ProtectedATMInquiryRequest, com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02.ProtectedATMCompletionAcknowledgement,
						com.tools20022.repository.area.catp.ATMCompletionAdviceV02.ProtectedATMCompletionAdvice, com.tools20022.repository.area.catp.ATMTransferResponseV01.ProtectedATMTransferResponse,
						com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02.ProtectedATMKeyDownloadResponse);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType10";
				definition = "General cryptographic message syntax (CMS) containing encrypted data.";
				previousVersion_lazy = () -> ContentInformationType7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}