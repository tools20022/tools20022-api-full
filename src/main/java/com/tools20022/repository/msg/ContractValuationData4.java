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
import com.tools20022.repository.codeset.ValuationType1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralValuation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection54;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to contract valuation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractValuationData4#mmValue
 * ContractValuationData4.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractValuationData4#mmTimeStamp
 * ContractValuationData4.mmTimeStamp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractValuationData4#mmType
 * ContractValuationData4.mmType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forContractValuationData4
 * ConstraintOneElementPresentRule.forContractValuationData4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContractValuationData4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to contract valuation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractValuationData4", propOrder = {"value", "timeStamp", "type"})
public class ContractValuationData4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Val")
	protected AmountAndDirection54 value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection54
	 * AmountAndDirection54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmValuation
	 * Collateral.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractValuationData4
	 * ContractValuationData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mark to market valuation of the contract, or mark to model valuation. The CCP’s valuation to be used for a cleared trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractValuationData4, Optional<AmountAndDirection54>> mmValue = new MMMessageAssociationEnd<ContractValuationData4, Optional<AmountAndDirection54>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmValuation;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractValuationData4.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Mark to market valuation of the contract, or mark to model valuation. The CCP’s valuation to be used for a cleared trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection54.mmObject();
		}

		@Override
		public Optional<AmountAndDirection54> getValue(ContractValuationData4 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(ContractValuationData4 obj, Optional<AmountAndDirection54> value) {
			obj.setValue(value.orElse(null));
		}
	};
	@XmlElement(name = "TmStmp")
	protected ISODateTime timeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
	 * CollateralValuation.mmCollateralValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractValuationData4
	 * ContractValuationData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the last valuation.\r\n\r\nUsage: For mark-to-market valuation the date and time of publishing of reference prices shall be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractValuationData4, Optional<ISODateTime>> mmTimeStamp = new MMMessageAttribute<ContractValuationData4, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateralValuationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractValuationData4.mmObject();
			isDerived = false;
			xmlTag = "TmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeStamp";
			definition = "Date and time of the last valuation.\r\n\r\nUsage: For mark-to-market valuation the date and time of publishing of reference prices shall be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ContractValuationData4 obj) {
			return obj.getTimeStamp();
		}

		@Override
		public void setValue(ContractValuationData4 obj, Optional<ISODateTime> value) {
			obj.setTimeStamp(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected ValuationType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationType1Code
	 * ValuationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractValuationData4
	 * ContractValuationData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether valuation was performed mark to market, mark to model or provided by the CCP."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractValuationData4, Optional<ValuationType1Code>> mmType = new MMMessageAttribute<ContractValuationData4, Optional<ValuationType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractValuationData4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicate whether valuation was performed mark to market, mark to model or provided by the CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ValuationType1Code.mmObject();
		}

		@Override
		public Optional<ValuationType1Code> getValue(ContractValuationData4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ContractValuationData4 obj, Optional<ValuationType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractValuationData4.mmValue, com.tools20022.repository.msg.ContractValuationData4.mmTimeStamp,
						com.tools20022.repository.msg.ContractValuationData4.mmType);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forContractValuationData4);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ContractValuationData4";
				definition = "Information related to contract valuation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection54> getValue() {
		return value == null ? Optional.empty() : Optional.of(value);
	}

	public ContractValuationData4 setValue(AmountAndDirection54 value) {
		this.value = value;
		return this;
	}

	public Optional<ISODateTime> getTimeStamp() {
		return timeStamp == null ? Optional.empty() : Optional.of(timeStamp);
	}

	public ContractValuationData4 setTimeStamp(ISODateTime timeStamp) {
		this.timeStamp = timeStamp;
		return this;
	}

	public Optional<ValuationType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public ContractValuationData4 setType(ValuationType1Code type) {
		this.type = type;
		return this;
	}
}