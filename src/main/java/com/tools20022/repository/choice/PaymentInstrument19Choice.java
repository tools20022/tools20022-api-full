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
import com.tools20022.repository.entity.ChequeIssue;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Cheque4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of payment instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice#mmChequeDetails
 * PaymentInstrument19Choice.mmChequeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice#mmBankersDraftDetails
 * PaymentInstrument19Choice.mmBankersDraftDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentInstrument19Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of payment instruments."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument16Choice
 * PaymentInstrument16Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentInstrument19Choice", propOrder = {"chequeDetails", "bankersDraftDetails"})
public class PaymentInstrument19Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Cheque4 chequeDetails;
	/**
	 * Settlement instructions for a payment by cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque4 Cheque4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice
	 * PaymentInstrument19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement instructions for a payment by cheque."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument16Choice#mmChequeDetails
	 * PaymentInstrument16Choice.mmChequeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChequeDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> PaymentInstrument19Choice.mmObject();
			isDerived = false;
			xmlTag = "ChqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDetails";
			definition = "Settlement instructions for a payment by cheque.";
			previousVersion_lazy = () -> PaymentInstrument16Choice.mmChequeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque4.mmObject();
		}
	};
	protected Cheque4 bankersDraftDetails;
	/**
	 * Settlement instructions for a payment by draft.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque4 Cheque4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice
	 * PaymentInstrument19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkrsDrftDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersDraftDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement instructions for a payment by draft."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument16Choice#mmBankersDraftDetails
	 * PaymentInstrument16Choice.mmBankersDraftDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBankersDraftDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> PaymentInstrument19Choice.mmObject();
			isDerived = false;
			xmlTag = "BkrsDrftDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersDraftDetails";
			definition = "Settlement instructions for a payment by draft.";
			previousVersion_lazy = () -> PaymentInstrument16Choice.mmBankersDraftDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentInstrument19Choice.mmChequeDetails, PaymentInstrument19Choice.mmBankersDraftDetails);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrument19Choice";
				definition = "Choice of payment instruments.";
				previousVersion_lazy = () -> PaymentInstrument16Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ChqDtls", required = true)
	public Cheque4 getChequeDetails() {
		return chequeDetails;
	}

	public void setChequeDetails(Cheque4 chequeDetails) {
		this.chequeDetails = chequeDetails;
	}

	@XmlElement(name = "BkrsDrftDtls", required = true)
	public Cheque4 getBankersDraftDetails() {
		return bankersDraftDetails;
	}

	public void setBankersDraftDetails(Cheque4 bankersDraftDetails) {
		this.bankersDraftDetails = bankersDraftDetails;
	}
}