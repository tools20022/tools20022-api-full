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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransferOut12;
import com.tools20022.repository.msg.TransferReference6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between reversal by reference or by reversal details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reversal3Choice#mmReferences
 * Reversal3Choice.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reversal3Choice#mmTransferOutConfirmationDetails
 * Reversal3Choice.mmTransferOutConfirmationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05#mmReversal
 * ReversalOfTransferOutConfirmationV05.mmReversal}</li>
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
 * "Reversal3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between reversal by reference or by reversal details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal5Choice
 * Reversal5Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Reversal1Choice Reversal1Choice}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reversal3Choice", propOrder = {"references", "transferOutConfirmationDetails"})
public class Reversal3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs", required = true)
	protected List<TransferReference6> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference6
	 * TransferReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reversal3Choice
	 * Reversal3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the transfer confirmation to be reversed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal5Choice#mmReferences
	 * Reversal5Choice.mmReferences}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reversal1Choice#mmReference
	 * Reversal1Choice.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferences = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reversal3Choice.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference of the transfer confirmation to be reversed.";
			nextVersions_lazy = () -> Arrays.asList(Reversal5Choice.mmReferences);
			previousVersion_lazy = () -> Reversal1Choice.mmReference;
			minOccurs = 1;
			complexType_lazy = () -> TransferReference6.mmObject();
		}
	};
	@XmlElement(name = "TrfOutConfDtls", required = true)
	protected TransferOut12 transferOutConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferOut12
	 * TransferOut12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reversal3Choice
	 * Reversal3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfOutConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOutConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transfer out confirmation to be reversed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal5Choice#mmTransferOutConfirmationDetails
	 * Reversal5Choice.mmTransferOutConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reversal1Choice#mmTransferOutConfirmationDetails
	 * Reversal1Choice.mmTransferOutConfirmationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferOutConfirmationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmRelatedSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reversal3Choice.mmObject();
			isDerived = false;
			xmlTag = "TrfOutConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOutConfirmationDetails";
			definition = "Details of the transfer out confirmation to be reversed.";
			nextVersions_lazy = () -> Arrays.asList(Reversal5Choice.mmTransferOutConfirmationDetails);
			previousVersion_lazy = () -> Reversal1Choice.mmTransferOutConfirmationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferOut12.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reversal3Choice.mmReferences, com.tools20022.repository.choice.Reversal3Choice.mmTransferOutConfirmationDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV05.mmReversal);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reversal3Choice";
				definition = "Choice between reversal by reference or by reversal details.";
				nextVersions_lazy = () -> Arrays.asList(Reversal5Choice.mmObject());
				previousVersion_lazy = () -> Reversal1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransferReference6> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public Reversal3Choice setReferences(List<TransferReference6> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public TransferOut12 getTransferOutConfirmationDetails() {
		return transferOutConfirmationDetails;
	}

	public Reversal3Choice setTransferOutConfirmationDetails(TransferOut12 transferOutConfirmationDetails) {
		this.transferOutConfirmationDetails = Objects.requireNonNull(transferOutConfirmationDetails);
		return this;
	}
}