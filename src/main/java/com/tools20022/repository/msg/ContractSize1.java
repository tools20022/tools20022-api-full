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
import com.tools20022.repository.choice.UnitOfMeasure5Choice;
import com.tools20022.repository.datatype.PositiveNumber;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.TradingMarket;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of an underlying of a derivative or security that constitutes one lot
 * of such derivative on an exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractSize1#mmLotSize
 * ContractSize1.mmLotSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractSize1#mmUnit
 * ContractSize1.mmUnit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradingMarket
 * TradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContractSize1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of an underlying of a derivative or security that constitutes one lot of such derivative on an exchange."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractSize1", propOrder = {"lotSize", "unit"})
public class ContractSize1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LotSz", required = true)
	protected PositiveNumber lotSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PositiveNumber
	 * PositiveNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
	 * TradingMarket.mmTradeLotSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractSize1 ContractSize1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total quantity of financial product to be delivered as per the terms of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContractSize1, PositiveNumber> mmLotSize = new MMMessageAttribute<ContractSize1, PositiveNumber>() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradeLotSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractSize1.mmObject();
			isDerived = false;
			xmlTag = "LotSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotSize";
			definition = "Specifies the total quantity of financial product to be delivered as per the terms of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PositiveNumber.mmObject();
		}

		@Override
		public PositiveNumber getValue(ContractSize1 obj) {
			return obj.getLotSize();
		}

		@Override
		public void setValue(ContractSize1 obj, PositiveNumber value) {
			obj.setLotSize(value);
		}
	};
	@XmlElement(name = "Unit")
	protected UnitOfMeasure5Choice unit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure5Choice
	 * UnitOfMeasure5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmUnitOfMeasure
	 * Price.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContractSize1 ContractSize1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the unit of underlying.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContractSize1, Optional<UnitOfMeasure5Choice>> mmUnit = new MMMessageAssociationEnd<ContractSize1, Optional<UnitOfMeasure5Choice>>() {
		{
			businessElementTrace_lazy = () -> Price.mmUnitOfMeasure;
			componentContext_lazy = () -> com.tools20022.repository.msg.ContractSize1.mmObject();
			isDerived = false;
			xmlTag = "Unit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Specifies the unit of underlying.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitOfMeasure5Choice.mmObject();
		}

		@Override
		public Optional<UnitOfMeasure5Choice> getValue(ContractSize1 obj) {
			return obj.getUnit();
		}

		@Override
		public void setValue(ContractSize1 obj, Optional<UnitOfMeasure5Choice> value) {
			obj.setUnit(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractSize1.mmLotSize, com.tools20022.repository.msg.ContractSize1.mmUnit);
				trace_lazy = () -> TradingMarket.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ContractSize1";
				definition = "Amount of an underlying of a derivative or security that constitutes one lot of such derivative on an exchange.";
			}
		});
		return mmObject_lazy.get();
	}

	public PositiveNumber getLotSize() {
		return lotSize;
	}

	public ContractSize1 setLotSize(PositiveNumber lotSize) {
		this.lotSize = Objects.requireNonNull(lotSize);
		return this;
	}

	public Optional<UnitOfMeasure5Choice> getUnit() {
		return unit == null ? Optional.empty() : Optional.of(unit);
	}

	public ContractSize1 setUnit(UnitOfMeasure5Choice unit) {
		this.unit = unit;
		return this;
	}
}