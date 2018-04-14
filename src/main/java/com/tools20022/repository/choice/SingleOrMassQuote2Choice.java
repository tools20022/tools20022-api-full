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
import com.tools20022.repository.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.QuoteStatus2;
import com.tools20022.repository.msg.SingleQuote1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a single or a mass quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote2Choice#mmSingleQuoteDetails
 * SingleOrMassQuote2Choice.mmSingleQuoteDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote2Choice#mmMassQuoteDetails
 * SingleOrMassQuote2Choice.mmMassQuoteDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SingleOrMassQuote2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a single or a mass quote."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SingleOrMassQuote2Choice", propOrder = {"singleQuoteDetails", "massQuoteDetails"})
public class SingleOrMassQuote2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SnglQtDtls", required = true)
	protected SingleQuote1 singleQuoteDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SingleQuote1
	 * SingleQuote1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote2Choice
	 * SingleOrMassQuote2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglQtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleQuoteDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to a single quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleOrMassQuote2Choice, SingleQuote1> mmSingleQuoteDetails = new MMMessageAssociationEnd<SingleOrMassQuote2Choice, SingleQuote1>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesQuoteVariable.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SingleOrMassQuote2Choice.mmObject();
			isDerived = false;
			xmlTag = "SnglQtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleQuoteDetails";
			definition = "Details related to a single quote.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SingleQuote1.mmObject();
		}

		@Override
		public SingleQuote1 getValue(SingleOrMassQuote2Choice obj) {
			return obj.getSingleQuoteDetails();
		}

		@Override
		public void setValue(SingleOrMassQuote2Choice obj, SingleQuote1 value) {
			obj.setSingleQuoteDetails(value);
		}
	};
	@XmlElement(name = "MassQtDtls", required = true)
	protected QuoteStatus2 massQuoteDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteStatus2
	 * QuoteStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SingleOrMassQuote2Choice
	 * SingleOrMassQuote2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MassQtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MassQuoteDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to a mass quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleOrMassQuote2Choice, QuoteStatus2> mmMassQuoteDetails = new MMMessageAssociationEnd<SingleOrMassQuote2Choice, QuoteStatus2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SingleOrMassQuote2Choice.mmObject();
			isDerived = false;
			xmlTag = "MassQtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MassQuoteDetails";
			definition = "Details related to a mass quote.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuoteStatus2.mmObject();
		}

		@Override
		public QuoteStatus2 getValue(SingleOrMassQuote2Choice obj) {
			return obj.getMassQuoteDetails();
		}

		@Override
		public void setValue(SingleOrMassQuote2Choice obj, QuoteStatus2 value) {
			obj.setMassQuoteDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SingleOrMassQuote2Choice.mmSingleQuoteDetails, com.tools20022.repository.choice.SingleOrMassQuote2Choice.mmMassQuoteDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SingleOrMassQuote2Choice";
				definition = "Choice between a single or a mass quote.";
			}
		});
		return mmObject_lazy.get();
	}

	public SingleQuote1 getSingleQuoteDetails() {
		return singleQuoteDetails;
	}

	public SingleOrMassQuote2Choice setSingleQuoteDetails(SingleQuote1 singleQuoteDetails) {
		this.singleQuoteDetails = Objects.requireNonNull(singleQuoteDetails);
		return this;
	}

	public QuoteStatus2 getMassQuoteDetails() {
		return massQuoteDetails;
	}

	public SingleOrMassQuote2Choice setMassQuoteDetails(QuoteStatus2 massQuoteDetails) {
		this.massQuoteDetails = Objects.requireNonNull(massQuoteDetails);
		return this;
	}
}