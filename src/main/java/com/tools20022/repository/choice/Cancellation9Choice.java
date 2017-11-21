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
import com.tools20022.repository.area.sese.TransferInCancellationRequestV06;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransferIn13;
import com.tools20022.repository.msg.TransferReference5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between cancellation by reference or by transfer details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice#mmReferences
 * Cancellation9Choice.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice#mmTransferInDetails
 * Cancellation9Choice.mmTransferInDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmCancellation
 * TransferInCancellationRequestV06.mmCancellation}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cancellation9Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between cancellation by reference or by transfer details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Cancellation10Choice
 * Cancellation10Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice
 * Cancellation5Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Cancellation9Choice", propOrder = {"references", "transferInDetails"})
public class Cancellation9Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected List<TransferReference5> references;
	/**
	 * Reference of the transfer to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference5
	 * TransferReference5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice
	 * Cancellation9Choice}</li>
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
	 * definition} = "Reference of the transfer to be cancelled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice#mmReferences
	 * Cancellation10Choice.mmReferences}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice#mmReferences
	 * Cancellation5Choice.mmReferences}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferences = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> Cancellation9Choice.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference of the transfer to be cancelled.";
			nextVersions_lazy = () -> Arrays.asList(Cancellation10Choice.mmReferences);
			previousVersion_lazy = () -> Cancellation5Choice.mmReferences;
			minOccurs = 1;
			complexType_lazy = () -> TransferReference5.mmObject();
		}
	};
	protected TransferIn13 transferInDetails;
	/**
	 * Details of the transfer in request to cancel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferIn13
	 * TransferIn13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation9Choice
	 * Cancellation9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transfer in request to cancel."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice#mmTransferInDetails
	 * Cancellation10Choice.mmTransferInDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice#mmTransferInDetails
	 * Cancellation5Choice.mmTransferInDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferInDetails = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> Cancellation9Choice.mmObject();
			isDerived = false;
			xmlTag = "TrfInDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInDetails";
			definition = "Details of the transfer in request to cancel.";
			nextVersions_lazy = () -> Arrays.asList(Cancellation10Choice.mmTransferInDetails);
			previousVersion_lazy = () -> Cancellation5Choice.mmTransferInDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferIn13.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Cancellation9Choice.mmReferences, Cancellation9Choice.mmTransferInDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInCancellationRequestV06.mmCancellation);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Cancellation9Choice";
				definition = "Choice between cancellation by reference or by transfer details.";
				nextVersions_lazy = () -> Arrays.asList(Cancellation10Choice.mmObject());
				previousVersion_lazy = () -> Cancellation5Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Refs", required = true)
	public List<TransferReference5> getReferences() {
		return references;
	}

	public void setReferences(List<TransferReference5> references) {
		this.references = references;
	}

	@XmlElement(name = "TrfInDtls", required = true)
	public TransferIn13 getTransferInDetails() {
		return transferInDetails;
	}

	public void setTransferInDetails(TransferIn13 transferInDetails) {
		this.transferInDetails = transferInDetails;
	}
}