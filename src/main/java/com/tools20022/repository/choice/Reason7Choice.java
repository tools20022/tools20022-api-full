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
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRepoCallAcknowledgementReason
 * Reason7Choice.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmCancellationReason
 * Reason7Choice.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingCancellationReason
 * Reason7Choice.mmPendingCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmGeneratedReason
 * Reason7Choice.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmDeniedReason
 * Reason7Choice.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmAcknowledgedAcceptedReason
 * Reason7Choice.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingReason
 * Reason7Choice.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmFailingReason
 * Reason7Choice.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingProcessingReason
 * Reason7Choice.mmPendingProcessingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRejectionReason
 * Reason7Choice.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmRepairReason
 * Reason7Choice.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmPendingModificationReason
 * Reason7Choice.mmPendingModificationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason7Choice#mmUnmatchedReason
 * Reason7Choice.mmUnmatchedReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason7Choice
 * ConstraintReasonRule.forReason7Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reason7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reason12Choice
 * Reason12Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Reason6Choice Reason6Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reason7Choice", propOrder = {"repoCallAcknowledgementReason", "cancellationReason", "pendingCancellationReason", "generatedReason", "deniedReason", "acknowledgedAcceptedReason", "pendingReason", "failingReason",
		"pendingProcessingReason", "rejectionReason", "repairReason", "pendingModificationReason", "unmatchedReason"})
public class Reason7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RepoCallAckRsn")
	protected AcknowledgementReason3Choice repoCallAcknowledgementReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepoCallAcknowledgementReason
	 * Reason12Choice.mmRepoCallAcknowledgementReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepoCallAcknowledgementReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallAckRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information on the repurchase agreement call request acknowledgement.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmRepoCallAcknowledgementReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgementReason3Choice.mmObject();
		}
	};
	@XmlElement(name = "CxlRsn")
	protected CancellationReason9Choice cancellationReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmCancellationReason
	 * Reason12Choice.mmCancellationReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmCancellationReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationReason9Choice.mmObject();
		}
	};
	@XmlElement(name = "PdgCxlRsn")
	protected PendingCancellationReasons2Choice pendingCancellationReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingCancellationReason
	 * Reason12Choice.mmPendingCancellationReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingCancellationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationReason";
			definition = "Specifies the reason why the cancellation request is pending.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmPendingCancellationReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingCancellationReasons2Choice.mmObject();
		}
	};
	@XmlElement(name = "GnrtdRsn")
	protected GeneratedReasons1Choice generatedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons1Choice
	 * GeneratedReasons1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmGeneratedReason
	 * Reason12Choice.mmGeneratedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGeneratedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "GnrtdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmGeneratedReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.GeneratedReasons1Choice.mmObject();
		}
	};
	@XmlElement(name = "DndRsn")
	protected DeniedReason1Choice deniedReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmDeniedReason
	 * Reason12Choice.mmDeniedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeniedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "DndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmDeniedReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.DeniedReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "AckdAccptdRsn")
	protected AcknowledgementReason2Choice acknowledgedAcceptedReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmAcknowledgedAcceptedReason
	 * Reason12Choice.mmAcknowledgedAcceptedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAcceptedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmAcknowledgedAcceptedReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgementReason2Choice.mmObject();
		}
	};
	@XmlElement(name = "PdgRsn")
	protected PendingReason11Choice pendingReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingReason
	 * Reason12Choice.mmPendingReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction has a pending status.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmPendingReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingReason11Choice.mmObject();
		}
	};
	@XmlElement(name = "FlngRsn")
	protected FailingReason1Choice failingReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmFailingReason
	 * Reason12Choice.mmFailingReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFailingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmFailingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "FlngRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailingReason";
			definition = "Specifies the reason why the instruction has a failing settlement status.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmFailingReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.FailingReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "PdgPrcgRsn")
	protected PendingProcessingReason1Choice pendingProcessingReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingProcessingReason
	 * Reason12Choice.mmPendingProcessingReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessingReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessingReason";
			definition = "Specifies the reason why the instruction has a pending processing status.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmPendingProcessingReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingReason1Choice.mmObject();
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReason5Choice rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason5Choice
	 * RejectionReason5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRejectionReason
	 * Reason12Choice.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectionReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a rejected status.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmRejectionReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectionReason5Choice.mmObject();
		}
	};
	@XmlElement(name = "RprRsn")
	protected RepairReason7Choice repairReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepairReason
	 * Reason12Choice.mmRepairReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "RprRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction is in repair.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmRepairReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairReason7Choice.mmObject();
		}
	};
	@XmlElement(name = "PdgModRsn")
	protected PendingReason2Choice pendingModificationReason;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingModificationReason
	 * Reason12Choice.mmPendingModificationReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingModificationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgModRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingModificationReason";
			definition = "Specifies the reason why the modification request is pending.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmPendingModificationReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingReason2Choice.mmObject();
		}
	};
	@XmlElement(name = "UmtchdRsn")
	protected UnmatchedReason8Choice unmatchedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason8Choice
	 * UnmatchedReason8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
	 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason7Choice Reason7Choice}
	 * </li>
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
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmUnmatchedReason
	 * Reason12Choice.mmUnmatchedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnmatchedReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmUnmatchedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason7Choice.mmObject();
			isDerived = false;
			xmlTag = "UmtchdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedReason";
			definition = "Specifies the reason why the instruction has an unmatched status.";
			nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmUnmatchedReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.UnmatchedReason8Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reason7Choice.mmRepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason7Choice.mmCancellationReason,
						com.tools20022.repository.choice.Reason7Choice.mmPendingCancellationReason, com.tools20022.repository.choice.Reason7Choice.mmGeneratedReason, com.tools20022.repository.choice.Reason7Choice.mmDeniedReason,
						com.tools20022.repository.choice.Reason7Choice.mmAcknowledgedAcceptedReason, com.tools20022.repository.choice.Reason7Choice.mmPendingReason, com.tools20022.repository.choice.Reason7Choice.mmFailingReason,
						com.tools20022.repository.choice.Reason7Choice.mmPendingProcessingReason, com.tools20022.repository.choice.Reason7Choice.mmRejectionReason, com.tools20022.repository.choice.Reason7Choice.mmRepairReason,
						com.tools20022.repository.choice.Reason7Choice.mmPendingModificationReason, com.tools20022.repository.choice.Reason7Choice.mmUnmatchedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonRule.forReason7Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reason7Choice";
				definition = "Choice of reason.";
				nextVersions_lazy = () -> Arrays.asList(Reason12Choice.mmObject());
				previousVersion_lazy = () -> Reason6Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AcknowledgementReason3Choice> getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason == null ? Optional.empty() : Optional.of(repoCallAcknowledgementReason);
	}

	public Reason7Choice setRepoCallAcknowledgementReason(com.tools20022.repository.choice.AcknowledgementReason3Choice repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = repoCallAcknowledgementReason;
		return this;
	}

	public Optional<CancellationReason9Choice> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public Reason7Choice setCancellationReason(com.tools20022.repository.choice.CancellationReason9Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public Optional<PendingCancellationReasons2Choice> getPendingCancellationReason() {
		return pendingCancellationReason == null ? Optional.empty() : Optional.of(pendingCancellationReason);
	}

	public Reason7Choice setPendingCancellationReason(com.tools20022.repository.choice.PendingCancellationReasons2Choice pendingCancellationReason) {
		this.pendingCancellationReason = pendingCancellationReason;
		return this;
	}

	public Optional<GeneratedReasons1Choice> getGeneratedReason() {
		return generatedReason == null ? Optional.empty() : Optional.of(generatedReason);
	}

	public Reason7Choice setGeneratedReason(com.tools20022.repository.choice.GeneratedReasons1Choice generatedReason) {
		this.generatedReason = generatedReason;
		return this;
	}

	public Optional<DeniedReason1Choice> getDeniedReason() {
		return deniedReason == null ? Optional.empty() : Optional.of(deniedReason);
	}

	public Reason7Choice setDeniedReason(com.tools20022.repository.choice.DeniedReason1Choice deniedReason) {
		this.deniedReason = deniedReason;
		return this;
	}

	public Optional<AcknowledgementReason2Choice> getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason == null ? Optional.empty() : Optional.of(acknowledgedAcceptedReason);
	}

	public Reason7Choice setAcknowledgedAcceptedReason(com.tools20022.repository.choice.AcknowledgementReason2Choice acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = acknowledgedAcceptedReason;
		return this;
	}

	public Optional<PendingReason11Choice> getPendingReason() {
		return pendingReason == null ? Optional.empty() : Optional.of(pendingReason);
	}

	public Reason7Choice setPendingReason(com.tools20022.repository.choice.PendingReason11Choice pendingReason) {
		this.pendingReason = pendingReason;
		return this;
	}

	public Optional<FailingReason1Choice> getFailingReason() {
		return failingReason == null ? Optional.empty() : Optional.of(failingReason);
	}

	public Reason7Choice setFailingReason(com.tools20022.repository.choice.FailingReason1Choice failingReason) {
		this.failingReason = failingReason;
		return this;
	}

	public Optional<PendingProcessingReason1Choice> getPendingProcessingReason() {
		return pendingProcessingReason == null ? Optional.empty() : Optional.of(pendingProcessingReason);
	}

	public Reason7Choice setPendingProcessingReason(com.tools20022.repository.choice.PendingProcessingReason1Choice pendingProcessingReason) {
		this.pendingProcessingReason = pendingProcessingReason;
		return this;
	}

	public Optional<RejectionReason5Choice> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public Reason7Choice setRejectionReason(com.tools20022.repository.choice.RejectionReason5Choice rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public Optional<RepairReason7Choice> getRepairReason() {
		return repairReason == null ? Optional.empty() : Optional.of(repairReason);
	}

	public Reason7Choice setRepairReason(com.tools20022.repository.choice.RepairReason7Choice repairReason) {
		this.repairReason = repairReason;
		return this;
	}

	public Optional<PendingReason2Choice> getPendingModificationReason() {
		return pendingModificationReason == null ? Optional.empty() : Optional.of(pendingModificationReason);
	}

	public Reason7Choice setPendingModificationReason(com.tools20022.repository.choice.PendingReason2Choice pendingModificationReason) {
		this.pendingModificationReason = pendingModificationReason;
		return this;
	}

	public Optional<UnmatchedReason8Choice> getUnmatchedReason() {
		return unmatchedReason == null ? Optional.empty() : Optional.of(unmatchedReason);
	}

	public Reason7Choice setUnmatchedReason(com.tools20022.repository.choice.UnmatchedReason8Choice unmatchedReason) {
		this.unmatchedReason = unmatchedReason;
		return this;
	}
}