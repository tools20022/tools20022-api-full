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
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepoCallAcknowledgementReason
 * Reason12Choice.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmCancellationReason
 * Reason12Choice.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingCancellationReason
 * Reason12Choice.mmPendingCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmGeneratedReason
 * Reason12Choice.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmDeniedReason
 * Reason12Choice.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmAcknowledgedAcceptedReason
 * Reason12Choice.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingReason
 * Reason12Choice.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmFailingReason
 * Reason12Choice.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingProcessingReason
 * Reason12Choice.mmPendingProcessingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRejectionReason
 * Reason12Choice.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepairReason
 * Reason12Choice.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingModificationReason
 * Reason12Choice.mmPendingModificationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmUnmatchedReason
 * Reason12Choice.mmUnmatchedReason}</li>
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
 * "Reason12Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reason14Choice
 * Reason14Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Reason12Choice", propOrder = {"repoCallAcknowledgementReason", "cancellationReason", "pendingCancellationReason", "generatedReason", "deniedReason", "acknowledgedAcceptedReason", "pendingReason", "failingReason",
		"pendingProcessingReason", "rejectionReason", "repairReason", "pendingModificationReason", "unmatchedReason"})
public class Reason12Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AcknowledgementReason3Choice repoCallAcknowledgementReason;
	/**
	 * Specifies additional information on the repurchase agreement call request
	 * acknowledgement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason3Choice
	 * AcknowledgementReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepoCallAcknowledgementReason
	 * SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepoCallAcknowledgementReason
	 * Reason14Choice.mmRepoCallAcknowledgementReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRepoCallAcknowledgementReason
	 * Reason7Choice.mmRepoCallAcknowledgementReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepoCallAcknowledgementReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallAckRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information on the repurchase agreement call request acknowledgement.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmRepoCallAcknowledgementReason);
			previousVersion_lazy = () -> Reason7Choice.mmRepoCallAcknowledgementReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgementReason3Choice.mmObject();
		}
	};
	protected CancellationReason9Choice cancellationReason;
	/**
	 * Specifies the reason why the related instruction is cancelled, or the
	 * related cancellation request is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason9Choice
	 * CancellationReason9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmCancellationReason
	 * Reason14Choice.mmCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmCancellationReason
	 * Reason7Choice.mmCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmCancellationReason);
			previousVersion_lazy = () -> Reason7Choice.mmCancellationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationReason9Choice.mmObject();
		}
	};
	protected PendingCancellationReasons2Choice pendingCancellationReason;
	/**
	 * Specifies the reason why the cancellation request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons2Choice
	 * PendingCancellationReasons2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingCancellationReason
	 * Reason14Choice.mmPendingCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingCancellationReason
	 * Reason7Choice.mmPendingCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingCancellationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationReason";
			definition = "Specifies the reason why the cancellation request is pending.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmPendingCancellationReason);
			previousVersion_lazy = () -> Reason7Choice.mmPendingCancellationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingCancellationReasons2Choice.mmObject();
		}
	};
	protected GeneratedReasons3Choice generatedReason;
	/**
	 * Specifies the reason why the transaction was generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons3Choice
	 * GeneratedReasons3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmGeneratedReason
	 * Reason14Choice.mmGeneratedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmGeneratedReason
	 * Reason7Choice.mmGeneratedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGeneratedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "GnrtdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmGeneratedReason);
			previousVersion_lazy = () -> Reason7Choice.mmGeneratedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.GeneratedReasons3Choice.mmObject();
		}
	};
	protected DeniedReason1Choice deniedReason;
	/**
	 * Specifies the reason why the request was denied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DeniedReason1Choice
	 * DeniedReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmDeniedReason
	 * Reason14Choice.mmDeniedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmDeniedReason
	 * Reason7Choice.mmDeniedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeniedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "DndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmDeniedReason);
			previousVersion_lazy = () -> Reason7Choice.mmDeniedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.DeniedReason1Choice.mmObject();
		}
	};
	protected AcknowledgementReason2Choice acknowledgedAcceptedReason;
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason2Choice
	 * AcknowledgementReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmAcknowledgedAcceptedReason
	 * Reason14Choice.mmAcknowledgedAcceptedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmAcknowledgedAcceptedReason
	 * Reason7Choice.mmAcknowledgedAcceptedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAcceptedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmAcknowledgedAcceptedReason);
			previousVersion_lazy = () -> Reason7Choice.mmAcknowledgedAcceptedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgementReason2Choice.mmObject();
		}
	};
	protected PendingReason11Choice pendingReason;
	/**
	 * Specifies the reason why the instruction has a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason11Choice
	 * PendingReason11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingReason
	 * Reason14Choice.mmPendingReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingReason
	 * Reason7Choice.mmPendingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction has a pending status.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmPendingReason);
			previousVersion_lazy = () -> Reason7Choice.mmPendingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingReason11Choice.mmObject();
		}
	};
	protected FailingReason1Choice failingReason;
	/**
	 * Specifies the reason why the instruction has a failing settlement status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FailingReason1Choice
	 * FailingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmFailingReason
	 * StatusReason.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmFailingReason
	 * Reason14Choice.mmFailingReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmFailingReason
	 * Reason7Choice.mmFailingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFailingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmFailingReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "FlngRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailingReason";
			definition = "Specifies the reason why the instruction has a failing settlement status.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmFailingReason);
			previousVersion_lazy = () -> Reason7Choice.mmFailingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.FailingReason1Choice.mmObject();
		}
	};
	protected PendingProcessingReason1Choice pendingProcessingReason;
	/**
	 * Specifies the reason why the instruction has a pending processing status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason1Choice
	 * PendingProcessingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingProcessingReason
	 * Reason14Choice.mmPendingProcessingReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingProcessingReason
	 * Reason7Choice.mmPendingProcessingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessingReason";
			definition = "Specifies the reason why the instruction has a pending processing status.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmPendingProcessingReason);
			previousVersion_lazy = () -> Reason7Choice.mmPendingProcessingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingReason1Choice.mmObject();
		}
	};
	protected RejectionReason16Choice rejectionReason;
	/**
	 * Specifies the reason why the instruction/request has a rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason16Choice
	 * RejectionReason16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRejectionReason
	 * Reason14Choice.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRejectionReason
	 * Reason7Choice.mmRejectionReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectionReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a rejected status.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmRejectionReason);
			previousVersion_lazy = () -> Reason7Choice.mmRejectionReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectionReason16Choice.mmObject();
		}
	};
	protected RepairReason7Choice repairReason;
	/**
	 * Specifies the reason why the instruction is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RepairReason7Choice
	 * RepairReason7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepairReason
	 * Reason14Choice.mmRepairReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRepairReason
	 * Reason7Choice.mmRepairReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "RprRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction is in repair.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmRepairReason);
			previousVersion_lazy = () -> Reason7Choice.mmRepairReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairReason7Choice.mmObject();
		}
	};
	protected PendingReason2Choice pendingModificationReason;
	/**
	 * Specifies the reason why the modification request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason2Choice
	 * PendingReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingModificationReason
	 * Reason14Choice.mmPendingModificationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingModificationReason
	 * Reason7Choice.mmPendingModificationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingModificationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgModRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingModificationReason";
			definition = "Specifies the reason why the modification request is pending.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmPendingModificationReason);
			previousVersion_lazy = () -> Reason7Choice.mmPendingModificationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingReason2Choice.mmObject();
		}
	};
	protected UnmatchedReason16Choice unmatchedReason;
	/**
	 * Specifies the reason why the instruction has an unmatched status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason16Choice
	 * UnmatchedReason16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
	 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmUnmatchedReason
	 * Reason14Choice.mmUnmatchedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmUnmatchedReason
	 * Reason7Choice.mmUnmatchedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnmatchedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmUnmatchedReason;
			componentContext_lazy = () -> Reason12Choice.mmObject();
			isDerived = false;
			xmlTag = "UmtchdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedReason";
			definition = "Specifies the reason why the instruction has an unmatched status.";
			nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmUnmatchedReason);
			previousVersion_lazy = () -> Reason7Choice.mmUnmatchedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.UnmatchedReason16Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reason12Choice.mmRepoCallAcknowledgementReason, Reason12Choice.mmCancellationReason, Reason12Choice.mmPendingCancellationReason, Reason12Choice.mmGeneratedReason,
						Reason12Choice.mmDeniedReason, Reason12Choice.mmAcknowledgedAcceptedReason, Reason12Choice.mmPendingReason, Reason12Choice.mmFailingReason, Reason12Choice.mmPendingProcessingReason, Reason12Choice.mmRejectionReason,
						Reason12Choice.mmRepairReason, Reason12Choice.mmPendingModificationReason, Reason12Choice.mmUnmatchedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reason12Choice";
				definition = "Choice of reason.";
				nextVersions_lazy = () -> Arrays.asList(Reason14Choice.mmObject());
				previousVersion_lazy = () -> Reason7Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RepoCallAckRsn")
	public AcknowledgementReason3Choice getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason;
	}

	public void setRepoCallAcknowledgementReason(com.tools20022.repository.choice.AcknowledgementReason3Choice repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = repoCallAcknowledgementReason;
	}

	@XmlElement(name = "CxlRsn")
	public CancellationReason9Choice getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(com.tools20022.repository.choice.CancellationReason9Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "PdgCxlRsn")
	public PendingCancellationReasons2Choice getPendingCancellationReason() {
		return pendingCancellationReason;
	}

	public void setPendingCancellationReason(com.tools20022.repository.choice.PendingCancellationReasons2Choice pendingCancellationReason) {
		this.pendingCancellationReason = pendingCancellationReason;
	}

	@XmlElement(name = "GnrtdRsn")
	public GeneratedReasons3Choice getGeneratedReason() {
		return generatedReason;
	}

	public void setGeneratedReason(com.tools20022.repository.choice.GeneratedReasons3Choice generatedReason) {
		this.generatedReason = generatedReason;
	}

	@XmlElement(name = "DndRsn")
	public DeniedReason1Choice getDeniedReason() {
		return deniedReason;
	}

	public void setDeniedReason(com.tools20022.repository.choice.DeniedReason1Choice deniedReason) {
		this.deniedReason = deniedReason;
	}

	@XmlElement(name = "AckdAccptdRsn")
	public AcknowledgementReason2Choice getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason;
	}

	public void setAcknowledgedAcceptedReason(com.tools20022.repository.choice.AcknowledgementReason2Choice acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = acknowledgedAcceptedReason;
	}

	@XmlElement(name = "PdgRsn")
	public PendingReason11Choice getPendingReason() {
		return pendingReason;
	}

	public void setPendingReason(com.tools20022.repository.choice.PendingReason11Choice pendingReason) {
		this.pendingReason = pendingReason;
	}

	@XmlElement(name = "FlngRsn")
	public FailingReason1Choice getFailingReason() {
		return failingReason;
	}

	public void setFailingReason(com.tools20022.repository.choice.FailingReason1Choice failingReason) {
		this.failingReason = failingReason;
	}

	@XmlElement(name = "PdgPrcgRsn")
	public PendingProcessingReason1Choice getPendingProcessingReason() {
		return pendingProcessingReason;
	}

	public void setPendingProcessingReason(com.tools20022.repository.choice.PendingProcessingReason1Choice pendingProcessingReason) {
		this.pendingProcessingReason = pendingProcessingReason;
	}

	@XmlElement(name = "RjctnRsn")
	public RejectionReason16Choice getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(com.tools20022.repository.choice.RejectionReason16Choice rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	@XmlElement(name = "RprRsn")
	public RepairReason7Choice getRepairReason() {
		return repairReason;
	}

	public void setRepairReason(com.tools20022.repository.choice.RepairReason7Choice repairReason) {
		this.repairReason = repairReason;
	}

	@XmlElement(name = "PdgModRsn")
	public PendingReason2Choice getPendingModificationReason() {
		return pendingModificationReason;
	}

	public void setPendingModificationReason(com.tools20022.repository.choice.PendingReason2Choice pendingModificationReason) {
		this.pendingModificationReason = pendingModificationReason;
	}

	@XmlElement(name = "UmtchdRsn")
	public UnmatchedReason16Choice getUnmatchedReason() {
		return unmatchedReason;
	}

	public void setUnmatchedReason(com.tools20022.repository.choice.UnmatchedReason16Choice unmatchedReason) {
		this.unmatchedReason = unmatchedReason;
	}
}