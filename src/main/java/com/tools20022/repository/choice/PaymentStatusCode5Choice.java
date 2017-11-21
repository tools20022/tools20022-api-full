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
import com.tools20022.repository.codeset.FinalStatus1Code;
import com.tools20022.repository.codeset.PendingStatus4Code;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a list of pending statuses or final statuses.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmPending
 * PaymentStatusCode5Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmFinal
 * PaymentStatusCode5Choice.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmRTGS
 * PaymentStatusCode5Choice.mmRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmSettlement
 * PaymentStatusCode5Choice.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmProprietary
 * PaymentStatusCode5Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
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
 * "PaymentStatusCode5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a list of pending statuses or final statuses."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice
 * PaymentStatusCode6Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentStatusCode5Choice", propOrder = {"pending", "final", "RTGS", "settlement", "proprietary"})
public class PaymentStatusCode5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PendingStatus4Code pending;
	/**
	 * Qualifies further the pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice
	 * PaymentStatusCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the pending status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmPending
	 * PaymentStatusCode6Choice.mmPending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPending = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> PaymentStatusCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Qualifies further the pending status.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusCode6Choice.mmPending);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingStatus4Code.mmObject();
		}
	};
	protected FinalStatus1Code final_;
	/**
	 * Qualifies further the final status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinalStatus1Code
	 * FinalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice
	 * PaymentStatusCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the final status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmFinal
	 * PaymentStatusCode6Choice.mmFinal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinal = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> PaymentStatusCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Fnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Qualifies further the final status.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusCode6Choice.mmFinal);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinalStatus1Code.mmObject();
		}
	};
	protected Max4AlphaNumericText rTGS;
	/**
	 * Qualifies further the RTGS status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRTGS
	 * CashSettlement.mmRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice
	 * PaymentStatusCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the RTGS status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmRTGS
	 * PaymentStatusCode6Choice.mmRTGS}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRTGS = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmRTGS;
			componentContext_lazy = () -> PaymentStatusCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "RTGS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGS";
			definition = "Qualifies further the RTGS status.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusCode6Choice.mmRTGS);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Max4AlphaNumericText settlement;
	/**
	 * Qualifies further the settlement status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice
	 * PaymentStatusCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the settlement status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmSettlement
	 * PaymentStatusCode6Choice.mmSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> PaymentStatusCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Sttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			definition = "Qualifies further the settlement status.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusCode6Choice.mmSettlement);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Max4AlphaNumericText proprietary;
	/**
	 * Qualifies further the proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice
	 * PaymentStatusCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the proprietary status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmProprietary
	 * PaymentStatusCode6Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> PaymentStatusCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Qualifies further the proprietary status.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusCode6Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentStatusCode5Choice.mmPending, PaymentStatusCode5Choice.mmFinal, PaymentStatusCode5Choice.mmRTGS, PaymentStatusCode5Choice.mmSettlement, PaymentStatusCode5Choice.mmProprietary);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentStatusCode5Choice";
				definition = "Choice between a list of pending statuses or final statuses.";
				nextVersions_lazy = () -> Arrays.asList(PaymentStatusCode6Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Pdg", required = true)
	public PendingStatus4Code getPending() {
		return pending;
	}

	public void setPending(PendingStatus4Code pending) {
		this.pending = pending;
	}

	@XmlElement(name = "Fnl", required = true)
	public FinalStatus1Code getFinal() {
		return final_;
	}

	public void setFinal(FinalStatus1Code final_) {
		this.final_ = final_;
	}

	@XmlElement(name = "RTGS", required = true)
	public Max4AlphaNumericText getRTGS() {
		return rTGS;
	}

	public void setRTGS(Max4AlphaNumericText rTGS) {
		this.rTGS = rTGS;
	}

	@XmlElement(name = "Sttlm", required = true)
	public Max4AlphaNumericText getSettlement() {
		return settlement;
	}

	public void setSettlement(Max4AlphaNumericText settlement) {
		this.settlement = settlement;
	}

	@XmlElement(name = "Prtry", required = true)
	public Max4AlphaNumericText getProprietary() {
		return proprietary;
	}

	public void setProprietary(Max4AlphaNumericText proprietary) {
		this.proprietary = proprietary;
	}
}