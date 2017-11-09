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
import com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06;
import com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07;
import com.tools20022.repository.codeset.PartialSettlement2Code;
import com.tools20022.repository.codeset.PreConfirmation1Code;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies additional parameters to the message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#mmPreConfirmation
 * AdditionalParameters26.mmPreConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#mmPartialSettlement
 * AdditionalParameters26.mmPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26#mmPreviousPartialConfirmationIdentification
 * AdditionalParameters26.mmPreviousPartialConfirmationIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06#mmAdditionalParameters
 * SecuritiesFinancingConfirmation002V06.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmAdditionalParameters
 * SecuritiesFinancingConfirmation002V07.mmAdditionalParameters}</li>
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
 * "AdditionalParameters26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional parameters to the message or transaction."</li>
 * </ul>
 */
public class AdditionalParameters26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PreConfirmation1Code preConfirmation;
	/**
	 * Specifies whether there exists a pre-confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmation1Code
	 * PreConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPreConfirmation
	 * SecuritiesSettlement.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26
	 * AdditionalParameters26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether there exists a pre-confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreConfirmation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPreConfirmation;
			componentContext_lazy = () -> AdditionalParameters26.mmObject();
			isDerived = false;
			xmlTag = "PreConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreConfirmation";
			definition = "Specifies whether there exists a pre-confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PreConfirmation1Code.mmObject();
		}
	};
	protected PartialSettlement2Code partialSettlement;
	/**
	 * Specifies partial settlement information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlement2Code
	 * PartialSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPartialSettlementType
	 * SecuritiesTransfer.mmPartialSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26
	 * AdditionalParameters26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies partial settlement information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPartialSettlementType;
			componentContext_lazy = () -> AdditionalParameters26.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			definition = "Specifies partial settlement information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PartialSettlement2Code.mmObject();
		}
	};
	protected RestrictedFINXMax16Text previousPartialConfirmationIdentification;
	/**
	 * Identification of the confirmation previously sent to confirm the partial
	 * settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26
	 * AdditionalParameters26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsPrtlConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousPartialConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the confirmation previously sent to confirm the partial settlement of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousPartialConfirmationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> AdditionalParameters26.mmObject();
			isDerived = false;
			xmlTag = "PrvsPrtlConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousPartialConfirmationIdentification";
			definition = "Identification of the confirmation previously sent to confirm the partial settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalParameters26.mmPreConfirmation, AdditionalParameters26.mmPartialSettlement, AdditionalParameters26.mmPreviousPartialConfirmationIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmation002V06.mmAdditionalParameters, SecuritiesFinancingConfirmation002V07.mmAdditionalParameters);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalParameters26";
				definition = "Specifies additional parameters to the message or transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public PreConfirmation1Code getPreConfirmation() {
		return preConfirmation;
	}

	public void setPreConfirmation(PreConfirmation1Code preConfirmation) {
		this.preConfirmation = preConfirmation;
	}

	public PartialSettlement2Code getPartialSettlement() {
		return partialSettlement;
	}

	public void setPartialSettlement(PartialSettlement2Code partialSettlement) {
		this.partialSettlement = partialSettlement;
	}

	public RestrictedFINXMax16Text getPreviousPartialConfirmationIdentification() {
		return previousPartialConfirmationIdentification;
	}

	public void setPreviousPartialConfirmationIdentification(RestrictedFINXMax16Text previousPartialConfirmationIdentification) {
		this.previousPartialConfirmationIdentification = previousPartialConfirmationIdentification;
	}
}