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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.CaseStatusReport;
import com.tools20022.repository.codeset.CaseStatus1Code;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmation1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.InvestigationCaseStatus;
import com.tools20022.repository.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the status of an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#mmDateTime
 * CaseStatus.mmDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#mmCaseStatus
 * CaseStatus.mmCaseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseStatus#mmInvestigationStatus
 * CaseStatus.mmInvestigationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#mmReason
 * CaseStatus.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
 * InvestigationCaseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReport#mmStatus
 * CaseStatusReport.mmStatus}</li>
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
 * "CaseStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the status of an investigation case."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CaseStatus", propOrder = {"dateTime", "caseStatus", "investigationStatus", "reason"})
public class CaseStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtTm", required = true)
	protected ISODateTime dateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CaseStatus
	 * CaseStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CaseStatus.mmObject();
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Date and time of the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "CaseSts", required = true)
	protected CaseStatus1Code caseStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CaseStatus1Code
	 * CaseStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus#mmCaseStatus
	 * InvestigationCaseStatus.mmCaseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CaseStatus
	 * CaseStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CaseSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the case."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCaseStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestigationCaseStatus.mmCaseStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CaseStatus.mmObject();
			isDerived = false;
			xmlTag = "CaseSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaseStatus";
			definition = "Status of the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "InvstgtnSts")
	protected InvestigationExecutionConfirmation1Code investigationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationExecutionConfirmation1Code
	 * InvestigationExecutionConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmInvestigationStatus
	 * PaymentInvestigationCaseResolution.mmInvestigationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CaseStatus
	 * CaseStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investigation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestigationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInvestigationCaseResolution.mmInvestigationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CaseStatus.mmObject();
			isDerived = false;
			xmlTag = "InvstgtnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationStatus";
			definition = "Status of the investigation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InvestigationExecutionConfirmation1Code.mmObject();
		}
	};
	@XmlElement(name = "Rsn")
	protected Max140Text reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CaseStatus
	 * CaseStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free text justification of the status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CaseStatus.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Free text justification of the status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CaseStatus.mmDateTime, com.tools20022.repository.msg.CaseStatus.mmCaseStatus, com.tools20022.repository.msg.CaseStatus.mmInvestigationStatus,
						com.tools20022.repository.msg.CaseStatus.mmReason);
				messageBuildingBlock_lazy = () -> Arrays.asList(CaseStatusReport.mmStatus);
				trace_lazy = () -> InvestigationCaseStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseStatus";
				definition = "Defines the status of an investigation case.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getDateTime() {
		return dateTime;
	}

	public CaseStatus setDateTime(ISODateTime dateTime) {
		this.dateTime = Objects.requireNonNull(dateTime);
		return this;
	}

	public CaseStatus1Code getCaseStatus() {
		return caseStatus;
	}

	public CaseStatus setCaseStatus(CaseStatus1Code caseStatus) {
		this.caseStatus = Objects.requireNonNull(caseStatus);
		return this;
	}

	public Optional<InvestigationExecutionConfirmation1Code> getInvestigationStatus() {
		return investigationStatus == null ? Optional.empty() : Optional.of(investigationStatus);
	}

	public CaseStatus setInvestigationStatus(InvestigationExecutionConfirmation1Code investigationStatus) {
		this.investigationStatus = investigationStatus;
		return this;
	}

	public Optional<Max140Text> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public CaseStatus setReason(Max140Text reason) {
		this.reason = reason;
		return this;
	}
}