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
import com.tools20022.repository.area.caam.*;
import com.tools20022.repository.area.catp.*;
import com.tools20022.repository.codeset.ContentType2Code;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.ContentInformationType10#mmContentType
 * ContentInformationType10.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType10#mmEnvelopedData
 * ContentInformationType10.mmEnvelopedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01#mmProtectedATMReconciliationAdvice
 * ATMReconciliationAdviceV01.mmProtectedATMReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01#mmProtectedATMReconciliationAcknowledgement
 * ATMReconciliationAcknowledgementV01.
 * mmProtectedATMReconciliationAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmProtectedHostToATMAcknowledgement
 * HostToATMAcknowledgementV01.mmProtectedHostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01#mmProtectedATMDiagnosticResponse
 * ATMDiagnosticResponseV01.mmProtectedATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#mmProtectedATMDiagnosticRequest
 * ATMDiagnosticRequestV01.mmProtectedATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01#mmProtectedATMKeyDownloadResponse
 * ATMKeyDownloadResponseV01.mmProtectedATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01#mmProtectedATMDeviceReport
 * ATMDeviceReportV01.mmProtectedATMDeviceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#mmProtectedHostToATMRequest
 * HostToATMRequestV01.mmProtectedHostToATMRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV01#mmProtectedATMKeyDownloadRequest
 * ATMKeyDownloadRequestV01.mmProtectedATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV01#mmProtectedATMDeviceControl
 * ATMDeviceControlV01.mmProtectedATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV01#mmProtectedATMInquiryResponse
 * ATMInquiryResponseV01.mmProtectedATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV01#mmProtectedATMInquiryRequest
 * ATMInquiryRequestV01.mmProtectedATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV01#mmProtectedATMCompletionAdvice
 * ATMCompletionAdviceV01.mmProtectedATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmProtectedATMWithdrawalResponse
 * ATMWithdrawalResponseV01.mmProtectedATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01#mmProtectedATMCompletionAcknowledgement
 * ATMCompletionAcknowledgementV01.mmProtectedATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01#mmProtectedATMWithdrawalCompletionAdvice
 * ATMWithdrawalCompletionAdviceV01.mmProtectedATMWithdrawalCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmProtectedATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV01.
 * mmProtectedATMWithdrawalCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV01#mmProtectedATMWithdrawalRequest
 * ATMWithdrawalRequestV01.mmProtectedATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV01#mmProtectedATMPINManagementRequest
 * ATMPINManagementRequestV01.mmProtectedATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV01#mmProtectedATMPINManagementResponse
 * ATMPINManagementResponseV01.mmProtectedATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01#mmProtectedATMExceptionAcknowledgement
 * ATMExceptionAcknowledgementV01.mmProtectedATMExceptionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02#mmProtectedATMWithdrawalRequest
 * ATMWithdrawalRequestV02.mmProtectedATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01#mmProtectedATMExceptionAdvice
 * ATMExceptionAdviceV01.mmProtectedATMExceptionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV02#mmProtectedATMDeviceControl
 * ATMDeviceControlV02.mmProtectedATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02#mmProtectedATMReconciliationAdvice
 * ATMReconciliationAdviceV02.mmProtectedATMReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02#mmProtectedATMReconciliationAcknowledgement
 * ATMReconciliationAcknowledgementV02.
 * mmProtectedATMReconciliationAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01#mmProtectedATMDepositResponse
 * ATMDepositResponseV01.mmProtectedATMDepositResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmProtectedATMDepositRequest
 * ATMDepositRequestV01.mmProtectedATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmProtectedATMWithdrawalCompletionAdvice
 * ATMWithdrawalCompletionAdviceV02.mmProtectedATMWithdrawalCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV02#mmProtectedATMInquiryResponse
 * ATMInquiryResponseV02.mmProtectedATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmProtectedATMDepositCompletionAcknowledgement
 * ATMDepositCompletionAcknowledgementV01.
 * mmProtectedATMDepositCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV02#mmProtectedATMDeviceReport
 * ATMDeviceReportV02.mmProtectedATMDeviceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02#mmProtectedATMPINManagementRequest
 * ATMPINManagementRequestV02.mmProtectedATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmProtectedATMTransferRequest
 * ATMTransferRequestV01.mmProtectedATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#mmProtectedATMDiagnosticResponse
 * ATMDiagnosticResponseV02.mmProtectedATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02#mmProtectedATMDiagnosticRequest
 * ATMDiagnosticRequestV02.mmProtectedATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02#mmProtectedATMKeyDownloadRequest
 * ATMKeyDownloadRequestV02.mmProtectedATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02#mmProtectedATMWithdrawalResponse
 * ATMWithdrawalResponseV02.mmProtectedATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02#mmProtectedATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV02.
 * mmProtectedATMWithdrawalCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02#mmProtectedATMPINManagementResponse
 * ATMPINManagementResponseV02.mmProtectedATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmProtectedATMDepositCompletionAdvice
 * ATMDepositCompletionAdviceV01.mmProtectedATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV02#mmProtectedATMInquiryRequest
 * ATMInquiryRequestV02.mmProtectedATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02#mmProtectedATMCompletionAcknowledgement
 * ATMCompletionAcknowledgementV02.mmProtectedATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02#mmProtectedATMCompletionAdvice
 * ATMCompletionAdviceV02.mmProtectedATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferResponseV01#mmProtectedATMTransferResponse
 * ATMTransferResponseV01.mmProtectedATMTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02#mmProtectedATMKeyDownloadResponse
 * ATMKeyDownloadResponseV02.mmProtectedATMKeyDownloadResponse}</li>
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
	protected ContentType2Code contentType;
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7#mmContentType
	 * ContentInformationType7.mmContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType10.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			previousVersion_lazy = () -> ContentInformationType7.mmContentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}
	};
	protected EnvelopedData4 envelopedData;
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7#mmEnvelopedData
	 * ContentInformationType7.mmEnvelopedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvelopedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType10.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption or by a digital envelope, with an encryption key.";
			previousVersion_lazy = () -> ContentInformationType7.mmEnvelopedData;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EnvelopedData4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContentInformationType10.mmContentType, ContentInformationType10.mmEnvelopedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMReconciliationAdviceV01.mmProtectedATMReconciliationAdvice, ATMReconciliationAcknowledgementV01.mmProtectedATMReconciliationAcknowledgement,
						HostToATMAcknowledgementV01.mmProtectedHostToATMAcknowledgement, ATMDiagnosticResponseV01.mmProtectedATMDiagnosticResponse, ATMDiagnosticRequestV01.mmProtectedATMDiagnosticRequest,
						ATMKeyDownloadResponseV01.mmProtectedATMKeyDownloadResponse, ATMDeviceReportV01.mmProtectedATMDeviceReport, HostToATMRequestV01.mmProtectedHostToATMRequest, ATMKeyDownloadRequestV01.mmProtectedATMKeyDownloadRequest,
						ATMDeviceControlV01.mmProtectedATMDeviceControl, ATMInquiryResponseV01.mmProtectedATMInquiryResponse, ATMInquiryRequestV01.mmProtectedATMInquiryRequest, ATMCompletionAdviceV01.mmProtectedATMCompletionAdvice,
						ATMWithdrawalResponseV01.mmProtectedATMWithdrawalResponse, ATMCompletionAcknowledgementV01.mmProtectedATMCompletionAcknowledgement, ATMWithdrawalCompletionAdviceV01.mmProtectedATMWithdrawalCompletionAdvice,
						ATMWithdrawalCompletionAcknowledgementV01.mmProtectedATMWithdrawalCompletionAcknowledgement, ATMWithdrawalRequestV01.mmProtectedATMWithdrawalRequest, ATMPINManagementRequestV01.mmProtectedATMPINManagementRequest,
						ATMPINManagementResponseV01.mmProtectedATMPINManagementResponse, ATMExceptionAcknowledgementV01.mmProtectedATMExceptionAcknowledgement, ATMWithdrawalRequestV02.mmProtectedATMWithdrawalRequest,
						ATMExceptionAdviceV01.mmProtectedATMExceptionAdvice, ATMDeviceControlV02.mmProtectedATMDeviceControl, ATMReconciliationAdviceV02.mmProtectedATMReconciliationAdvice,
						ATMReconciliationAcknowledgementV02.mmProtectedATMReconciliationAcknowledgement, ATMDepositResponseV01.mmProtectedATMDepositResponse, ATMDepositRequestV01.mmProtectedATMDepositRequest,
						ATMWithdrawalCompletionAdviceV02.mmProtectedATMWithdrawalCompletionAdvice, ATMInquiryResponseV02.mmProtectedATMInquiryResponse, ATMDepositCompletionAcknowledgementV01.mmProtectedATMDepositCompletionAcknowledgement,
						ATMDeviceReportV02.mmProtectedATMDeviceReport, ATMPINManagementRequestV02.mmProtectedATMPINManagementRequest, ATMTransferRequestV01.mmProtectedATMTransferRequest,
						ATMDiagnosticResponseV02.mmProtectedATMDiagnosticResponse, ATMDiagnosticRequestV02.mmProtectedATMDiagnosticRequest, ATMKeyDownloadRequestV02.mmProtectedATMKeyDownloadRequest,
						ATMWithdrawalResponseV02.mmProtectedATMWithdrawalResponse, ATMWithdrawalCompletionAcknowledgementV02.mmProtectedATMWithdrawalCompletionAcknowledgement,
						ATMPINManagementResponseV02.mmProtectedATMPINManagementResponse, ATMDepositCompletionAdviceV01.mmProtectedATMDepositCompletionAdvice, ATMInquiryRequestV02.mmProtectedATMInquiryRequest,
						ATMCompletionAcknowledgementV02.mmProtectedATMCompletionAcknowledgement, ATMCompletionAdviceV02.mmProtectedATMCompletionAdvice, ATMTransferResponseV01.mmProtectedATMTransferResponse,
						ATMKeyDownloadResponseV02.mmProtectedATMKeyDownloadResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType10";
				definition = "General cryptographic message syntax (CMS) containing encrypted data.";
				previousVersion_lazy = () -> ContentInformationType7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType2Code getContentType() {
		return contentType;
	}

	public void setContentType(ContentType2Code contentType) {
		this.contentType = contentType;
	}

	public EnvelopedData4 getEnvelopedData() {
		return envelopedData;
	}

	public void setEnvelopedData(com.tools20022.repository.msg.EnvelopedData4 envelopedData) {
		this.envelopedData = envelopedData;
	}
}