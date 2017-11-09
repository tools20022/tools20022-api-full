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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08;
import com.tools20022.repository.choice.ProcessingPosition23Choice;
import com.tools20022.repository.datatype.RestrictedFINMax16Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to a linked transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Linkages50#mmProcessingPosition
 * Linkages50.mmProcessingPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Linkages50#mmSecuritiesSettlementTransactionIdentification
 * Linkages50.mmSecuritiesSettlementTransactionIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmLinkages
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06#mmLinkages
 * SecuritiesSettlementTransactionConfirmation002V06.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08#mmLinkages
 * SecuritiesSettlementTransactionStatusAdvice002V08.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07#mmLinkages
 * SecuritiesSettlementTransactionConfirmation002V07.mmLinkages}</li>
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
 * "Linkages50"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to a linked transaction."</li>
 * </ul>
 */
public class Linkages50 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ProcessingPosition23Choice processingPosition;
	/**
	 * When the transaction is to be executed relative to a linked transaction -
	 * for information only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition23Choice
	 * ProcessingPosition23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages50
	 * Linkages50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction - for information only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Linkages41#mmProcessingPosition
	 * Linkages41.mmProcessingPosition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingPosition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Linkages50.mmObject();
			isDerived = false;
			xmlTag = "PrcgPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction - for information only.";
			previousVersion_lazy = () -> Linkages41.mmProcessingPosition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition23Choice.mmObject();
		}
	};
	protected RestrictedFINMax16Text securitiesSettlementTransactionIdentification;
	/**
	 * Unambiguous identification of a securities settlement transaction as
	 * known by the account owner (or instructing party acting on its behalf).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax16Text
	 * RestrictedFINMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages50
	 * Linkages50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a securities settlement transaction as known by the account owner (or instructing party acting on its behalf)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Linkages41#mmSecuritiesSettlementTransactionIdentification
	 * Linkages41.mmSecuritiesSettlementTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSettlementTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Linkages50.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionIdentification";
			definition = "Unambiguous identification of a securities settlement transaction as known by the account owner (or instructing party acting on its behalf).";
			previousVersion_lazy = () -> Linkages41.mmSecuritiesSettlementTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINMax16Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Linkages50.mmProcessingPosition, Linkages50.mmSecuritiesSettlementTransactionIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdvice002V07.mmLinkages, SecuritiesSettlementTransactionConfirmation002V06.mmLinkages,
						SecuritiesSettlementTransactionStatusAdvice002V08.mmLinkages, SecuritiesSettlementTransactionConfirmation002V07.mmLinkages);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Linkages50";
				definition = "Information related to a linked transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProcessingPosition23Choice getProcessingPosition() {
		return processingPosition;
	}

	public void setProcessingPosition(ProcessingPosition23Choice processingPosition) {
		this.processingPosition = processingPosition;
	}

	public RestrictedFINMax16Text getSecuritiesSettlementTransactionIdentification() {
		return securitiesSettlementTransactionIdentification;
	}

	public void setSecuritiesSettlementTransactionIdentification(RestrictedFINMax16Text securitiesSettlementTransactionIdentification) {
		this.securitiesSettlementTransactionIdentification = securitiesSettlementTransactionIdentification;
	}
}