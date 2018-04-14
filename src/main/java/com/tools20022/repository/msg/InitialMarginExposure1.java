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
import com.tools20022.repository.choice.MarginType2Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Amount3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Liability a clearing member has to a central counterparty with respect to
 * potential future exposures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InitialMarginExposure1#mmAmount
 * InitialMarginExposure1.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InitialMarginExposure1#mmType
 * InitialMarginExposure1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InitialMarginExposure1#mmCoreIndicator
 * InitialMarginExposure1.mmCoreIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InitialMarginExposure1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Liability a clearing member has to a central counterparty with respect to potential future exposures."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InitialMarginExposure1", propOrder = {"amount", "type", "coreIndicator"})
public class InitialMarginExposure1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected Amount3 amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount3 Amount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
	 * MarginCall.mmInitialMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InitialMarginExposure1
	 * InitialMarginExposure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial margin requirement for margin account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InitialMarginExposure1, Amount3> mmAmount = new MMMessageAssociationEnd<InitialMarginExposure1, Amount3>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmInitialMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.InitialMarginExposure1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Initial margin requirement for margin account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Amount3.mmObject();
		}

		@Override
		public Amount3 getValue(InitialMarginExposure1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(InitialMarginExposure1 obj, Amount3 value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected MarginType2Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.MarginType2Choice
	 * MarginType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginType
	 * MarginCall.mmMarginType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InitialMarginExposure1
	 * InitialMarginExposure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of component used in the calculation of the total initial margin requirement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InitialMarginExposure1, MarginType2Choice> mmType = new MMMessageAssociationEnd<InitialMarginExposure1, MarginType2Choice>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InitialMarginExposure1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Classification of component used in the calculation of the total initial margin requirement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginType2Choice.mmObject();
		}

		@Override
		public MarginType2Choice getValue(InitialMarginExposure1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(InitialMarginExposure1 obj, MarginType2Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "CoreInd", required = true)
	protected YesNoIndicator coreIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InitialMarginExposure1
	 * InitialMarginExposure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoreInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoreIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the component is considered a core part of the margin model. Usage: In the context of European central counterparties, if the component is included in backtesting procedures in order to assess the performance of the initial margin model as required by EMIR RTS Article (49)(1).\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InitialMarginExposure1, YesNoIndicator> mmCoreIndicator = new MMMessageAttribute<InitialMarginExposure1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InitialMarginExposure1.mmObject();
			isDerived = false;
			xmlTag = "CoreInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoreIndicator";
			definition = "Indicates whether the component is considered a core part of the margin model. Usage: In the context of European central counterparties, if the component is included in backtesting procedures in order to assess the performance of the initial margin model as required by EMIR RTS Article (49)(1).\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InitialMarginExposure1 obj) {
			return obj.getCoreIndicator();
		}

		@Override
		public void setValue(InitialMarginExposure1 obj, YesNoIndicator value) {
			obj.setCoreIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InitialMarginExposure1.mmAmount, com.tools20022.repository.msg.InitialMarginExposure1.mmType,
						com.tools20022.repository.msg.InitialMarginExposure1.mmCoreIndicator);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InitialMarginExposure1";
				definition = "Liability a clearing member has to a central counterparty with respect to potential future exposures.";
			}
		});
		return mmObject_lazy.get();
	}

	public Amount3 getAmount() {
		return amount;
	}

	public InitialMarginExposure1 setAmount(Amount3 amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public MarginType2Choice getType() {
		return type;
	}

	public InitialMarginExposure1 setType(MarginType2Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public YesNoIndicator getCoreIndicator() {
		return coreIndicator;
	}

	public InitialMarginExposure1 setCoreIndicator(YesNoIndicator coreIndicator) {
		this.coreIndicator = Objects.requireNonNull(coreIndicator);
		return this;
	}
}