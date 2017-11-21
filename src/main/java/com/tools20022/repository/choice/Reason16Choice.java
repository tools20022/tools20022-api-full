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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepoCallAcknowledgementReason
 * Reason16Choice.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmCancellationReason
 * Reason16Choice.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingCancellationReason
 * Reason16Choice.mmPendingCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmGeneratedReason
 * Reason16Choice.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmDeniedReason
 * Reason16Choice.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmAcknowledgedAcceptedReason
 * Reason16Choice.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingReason
 * Reason16Choice.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmFailingReason
 * Reason16Choice.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingProcessingReason
 * Reason16Choice.mmPendingProcessingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRejectionReason
 * Reason16Choice.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepairReason
 * Reason16Choice.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingModificationReason
 * Reason16Choice.mmPendingModificationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmUnmatchedReason
 * Reason16Choice.mmUnmatchedReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
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
 * "Reason16Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Reason14Choice Reason14Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Reason16Choice", propOrder = {"repoCallAcknowledgementReason", "cancellationReason", "pendingCancellationReason", "generatedReason", "deniedReason", "acknowledgedAcceptedReason", "pendingReason", "failingReason",
		"pendingProcessingReason", "rejectionReason", "repairReason", "pendingModificationReason", "unmatchedReason"})
public class Reason16Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AcknowledgementReason13Choice repoCallAcknowledgementReason;
	/**
	 * Specifies additional information on the repurchase agreement call request
	 * acknowledgement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason13Choice
	 * AcknowledgementReason13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepoCallAcknowledgementReason
	 * SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RepoCallAckRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallAcknowledgementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information on the repurchase agreement call request acknowledgement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepoCallAcknowledgementReason
	 * Reason14Choice.mmRepoCallAcknowledgementReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepoCallAcknowledgementReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallAckRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information on the repurchase agreement call request acknowledgement.";
			previousVersion_lazy = () -> Reason14Choice.mmRepoCallAcknowledgementReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgementReason13Choice.mmObject();
		}
	};
	protected CancellationReason20Choice cancellationReason;
	/**
	 * Specifies the reason why the related instruction is cancelled, or the
	 * related cancellation request is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason20Choice
	 * CancellationReason20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmCancellationReason
	 * Reason14Choice.mmCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			previousVersion_lazy = () -> Reason14Choice.mmCancellationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationReason20Choice.mmObject();
		}
	};
	protected PendingCancellationReasons4Choice pendingCancellationReason;
	/**
	 * Specifies the reason why the cancellation request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons4Choice
	 * PendingCancellationReasons4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the cancellation request is pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingCancellationReason
	 * Reason14Choice.mmPendingCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingCancellationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationReason";
			definition = "Specifies the reason why the cancellation request is pending.";
			previousVersion_lazy = () -> Reason14Choice.mmPendingCancellationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingCancellationReasons4Choice.mmObject();
		}
	};
	protected GeneratedReasons5Choice generatedReason;
	/**
	 * Specifies the reason why the transaction was generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons5Choice
	 * GeneratedReasons5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnrtdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmGeneratedReason
	 * Reason14Choice.mmGeneratedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGeneratedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "GnrtdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			previousVersion_lazy = () -> Reason14Choice.mmGeneratedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.GeneratedReasons5Choice.mmObject();
		}
	};
	protected DeniedReason14Choice deniedReason;
	/**
	 * Specifies the reason why the request was denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DeniedReason14Choice
	 * DeniedReason14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DndRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmDeniedReason
	 * Reason14Choice.mmDeniedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeniedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "DndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			previousVersion_lazy = () -> Reason14Choice.mmDeniedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.DeniedReason14Choice.mmObject();
		}
	};
	protected AcknowledgementReason12Choice acknowledgedAcceptedReason;
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason12Choice
	 * AcknowledgementReason12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmAcknowledgedAcceptedReason
	 * Reason14Choice.mmAcknowledgedAcceptedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAcceptedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			previousVersion_lazy = () -> Reason14Choice.mmAcknowledgedAcceptedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgementReason12Choice.mmObject();
		}
	};
	protected PendingReason29Choice pendingReason;
	/**
	 * Specifies the reason why the instruction has a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason29Choice
	 * PendingReason29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingReason
	 * Reason14Choice.mmPendingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction has a pending status.";
			previousVersion_lazy = () -> Reason14Choice.mmPendingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingReason29Choice.mmObject();
		}
	};
	protected FailingReason9Choice failingReason;
	/**
	 * Specifies the reason why the instruction has a failing settlement status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FailingReason9Choice
	 * FailingReason9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmFailingReason
	 * StatusReason.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlngRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a failing settlement status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmFailingReason
	 * Reason14Choice.mmFailingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFailingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmFailingReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "FlngRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailingReason";
			definition = "Specifies the reason why the instruction has a failing settlement status.";
			previousVersion_lazy = () -> Reason14Choice.mmFailingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.FailingReason9Choice.mmObject();
		}
	};
	protected PendingProcessingReason11Choice pendingProcessingReason;
	/**
	 * Specifies the reason why the instruction has a pending processing status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason11Choice
	 * PendingProcessingReason11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending processing status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingProcessingReason
	 * Reason14Choice.mmPendingProcessingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessingReason";
			definition = "Specifies the reason why the instruction has a pending processing status.";
			previousVersion_lazy = () -> Reason14Choice.mmPendingProcessingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingReason11Choice.mmObject();
		}
	};
	protected RejectionReason22Choice rejectionReason;
	/**
	 * Specifies the reason why the instruction/request has a rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason22Choice
	 * RejectionReason22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a rejected status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRejectionReason
	 * Reason14Choice.mmRejectionReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectionReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a rejected status.";
			previousVersion_lazy = () -> Reason14Choice.mmRejectionReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectionReason22Choice.mmObject();
		}
	};
	protected RepairReason11Choice repairReason;
	/**
	 * Specifies the reason why the instruction is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepairReason11Choice
	 * RepairReason11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the instruction is in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepairReason
	 * Reason14Choice.mmRepairReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "RprRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction is in repair.";
			previousVersion_lazy = () -> Reason14Choice.mmRepairReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairReason11Choice.mmObject();
		}
	};
	protected PendingReason28Choice pendingModificationReason;
	/**
	 * Specifies the reason why the modification request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason28Choice
	 * PendingReason28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgModRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingModificationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the modification request is pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingModificationReason
	 * Reason14Choice.mmPendingModificationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingModificationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgModRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingModificationReason";
			definition = "Specifies the reason why the modification request is pending.";
			previousVersion_lazy = () -> Reason14Choice.mmPendingModificationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingReason28Choice.mmObject();
		}
	};
	protected UnmatchedReason22Choice unmatchedReason;
	/**
	 * Specifies the reason why the instruction has an unmatched status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason22Choice
	 * UnmatchedReason22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
	 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice
	 * Reason16Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UmtchdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has an unmatched status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmUnmatchedReason
	 * Reason14Choice.mmUnmatchedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnmatchedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmUnmatchedReason;
			componentContext_lazy = () -> Reason16Choice.mmObject();
			isDerived = false;
			xmlTag = "UmtchdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedReason";
			definition = "Specifies the reason why the instruction has an unmatched status.";
			previousVersion_lazy = () -> Reason14Choice.mmUnmatchedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.UnmatchedReason22Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reason16Choice.mmRepoCallAcknowledgementReason, Reason16Choice.mmCancellationReason, Reason16Choice.mmPendingCancellationReason, Reason16Choice.mmGeneratedReason,
						Reason16Choice.mmDeniedReason, Reason16Choice.mmAcknowledgedAcceptedReason, Reason16Choice.mmPendingReason, Reason16Choice.mmFailingReason, Reason16Choice.mmPendingProcessingReason, Reason16Choice.mmRejectionReason,
						Reason16Choice.mmRepairReason, Reason16Choice.mmPendingModificationReason, Reason16Choice.mmUnmatchedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reason16Choice";
				definition = "Choice of reason.";
				previousVersion_lazy = () -> Reason14Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RepoCallAckRsn")
	public AcknowledgementReason13Choice getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason;
	}

	public void setRepoCallAcknowledgementReason(com.tools20022.repository.choice.AcknowledgementReason13Choice repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = repoCallAcknowledgementReason;
	}

	@XmlElement(name = "CxlRsn")
	public CancellationReason20Choice getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(com.tools20022.repository.choice.CancellationReason20Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "PdgCxlRsn")
	public PendingCancellationReasons4Choice getPendingCancellationReason() {
		return pendingCancellationReason;
	}

	public void setPendingCancellationReason(com.tools20022.repository.choice.PendingCancellationReasons4Choice pendingCancellationReason) {
		this.pendingCancellationReason = pendingCancellationReason;
	}

	@XmlElement(name = "GnrtdRsn")
	public GeneratedReasons5Choice getGeneratedReason() {
		return generatedReason;
	}

	public void setGeneratedReason(com.tools20022.repository.choice.GeneratedReasons5Choice generatedReason) {
		this.generatedReason = generatedReason;
	}

	@XmlElement(name = "DndRsn")
	public DeniedReason14Choice getDeniedReason() {
		return deniedReason;
	}

	public void setDeniedReason(com.tools20022.repository.choice.DeniedReason14Choice deniedReason) {
		this.deniedReason = deniedReason;
	}

	@XmlElement(name = "AckdAccptdRsn")
	public AcknowledgementReason12Choice getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason;
	}

	public void setAcknowledgedAcceptedReason(com.tools20022.repository.choice.AcknowledgementReason12Choice acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = acknowledgedAcceptedReason;
	}

	@XmlElement(name = "PdgRsn")
	public PendingReason29Choice getPendingReason() {
		return pendingReason;
	}

	public void setPendingReason(com.tools20022.repository.choice.PendingReason29Choice pendingReason) {
		this.pendingReason = pendingReason;
	}

	@XmlElement(name = "FlngRsn")
	public FailingReason9Choice getFailingReason() {
		return failingReason;
	}

	public void setFailingReason(com.tools20022.repository.choice.FailingReason9Choice failingReason) {
		this.failingReason = failingReason;
	}

	@XmlElement(name = "PdgPrcgRsn")
	public PendingProcessingReason11Choice getPendingProcessingReason() {
		return pendingProcessingReason;
	}

	public void setPendingProcessingReason(com.tools20022.repository.choice.PendingProcessingReason11Choice pendingProcessingReason) {
		this.pendingProcessingReason = pendingProcessingReason;
	}

	@XmlElement(name = "RjctnRsn")
	public RejectionReason22Choice getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(com.tools20022.repository.choice.RejectionReason22Choice rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	@XmlElement(name = "RprRsn")
	public RepairReason11Choice getRepairReason() {
		return repairReason;
	}

	public void setRepairReason(com.tools20022.repository.choice.RepairReason11Choice repairReason) {
		this.repairReason = repairReason;
	}

	@XmlElement(name = "PdgModRsn")
	public PendingReason28Choice getPendingModificationReason() {
		return pendingModificationReason;
	}

	public void setPendingModificationReason(com.tools20022.repository.choice.PendingReason28Choice pendingModificationReason) {
		this.pendingModificationReason = pendingModificationReason;
	}

	@XmlElement(name = "UmtchdRsn")
	public UnmatchedReason22Choice getUnmatchedReason() {
		return unmatchedReason;
	}

	public void setUnmatchedReason(com.tools20022.repository.choice.UnmatchedReason22Choice unmatchedReason) {
		this.unmatchedReason = unmatchedReason;
	}
}