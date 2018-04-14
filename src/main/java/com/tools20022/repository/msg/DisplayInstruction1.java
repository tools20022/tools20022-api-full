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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.DisplayMethod1Code;
import com.tools20022.repository.codeset.RefreshTime1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about strategy order/Iceberg orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmQuantity
 * DisplayInstruction1.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmSecondaryQuantity
 * DisplayInstruction1.mmSecondaryQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmMethod
 * DisplayInstruction1.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmLowQuantity
 * DisplayInstruction1.mmLowQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmHighQuantity
 * DisplayInstruction1.mmHighQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmMinimumIncrement
 * DisplayInstruction1.mmMinimumIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmRefreshQuantity
 * DisplayInstruction1.mmRefreshQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1#mmRefreshTime
 * DisplayInstruction1.mmRefreshTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisplayInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about strategy order/Iceberg orders."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DisplayInstruction1", propOrder = {"quantity", "secondaryQuantity", "method", "lowQuantity", "highQuantity", "minimumIncrement", "refreshQuantity", "refreshTime"})
public class DisplayInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Qty")
	protected FinancialInstrumentQuantityChoice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the quantity to be displayed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1138</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>> mmQuantity = new MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1138"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Indicates the quantity to be displayed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(DisplayInstruction1 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryQty")
	protected FinancialInstrumentQuantityChoice secondaryQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for reserve orders when Quantity applies to the primary execution market (e.g.an Electronic Communication Network) and another quantity is to be shown at other markets (e.g. the exchange)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1082</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>> mmSecondaryQuantity = new MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "ScndryQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1082"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryQuantity";
			definition = "Used for reserve orders when Quantity applies to the primary execution market (e.g.an Electronic Communication Network) and another quantity is to be shown at other markets (e.g. the exchange).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(DisplayInstruction1 obj) {
			return obj.getSecondaryQuantity();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setSecondaryQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "Mtd")
	protected DisplayMethod1Code method;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DisplayMethod1Code
	 * DisplayMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions for the use of Quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1084</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<DisplayMethod1Code>> mmMethod = new MMMessageAttribute<DisplayInstruction1, Optional<DisplayMethod1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1084"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Instructions for the use of Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DisplayMethod1Code.mmObject();
		}

		@Override
		public Optional<DisplayMethod1Code> getValue(DisplayInstruction1 obj) {
			return obj.getMethod();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<DisplayMethod1Code> value) {
			obj.setMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "LwQty")
	protected FinancialInstrumentQuantityChoice lowQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LwQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the lower quantity limit to a randomized refresh of Quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1085</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>> mmLowQuantity = new MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "LwQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1085"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowQuantity";
			definition = "Defines the lower quantity limit to a randomized refresh of Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(DisplayInstruction1 obj) {
			return obj.getLowQuantity();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setLowQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "HghQty")
	protected FinancialInstrumentQuantityChoice highQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the upper quantity limit to a randomized refresh of Quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1086</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>> mmHighQuantity = new MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "HghQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1086"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighQuantity";
			definition = "Defines the upper quantity limit to a randomized refresh of Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(DisplayInstruction1 obj) {
			return obj.getHighQuantity();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setHighQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "MinIncrmt")
	protected FinancialInstrumentQuantityChoice minimumIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinIncrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the minimum increment to be used when calculating a random refresh of Quantity. A user specifies this when he wants a larger increment than the standard provided by the market (e.g. the round lot size)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1087</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>> mmMinimumIncrement = new MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "MinIncrmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1087"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumIncrement";
			definition = "Defines the minimum increment to be used when calculating a random refresh of Quantity. A user specifies this when he wants a larger increment than the standard provided by the market (e.g. the round lot size).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(DisplayInstruction1 obj) {
			return obj.getMinimumIncrement();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setMinimumIncrement(value.orElse(null));
		}
	};
	@XmlElement(name = "RfrshQty")
	protected FinancialInstrumentQuantityChoice refreshQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrshQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefreshQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the quantity used to refresh Quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1088</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>> mmRefreshQuantity = new MMMessageAttribute<DisplayInstruction1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "RfrshQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1088"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefreshQuantity";
			definition = "Defines the quantity used to refresh Quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(DisplayInstruction1 obj) {
			return obj.getRefreshQuantity();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setRefreshQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "RfrshTm")
	protected RefreshTime1Code refreshTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RefreshTime1Code
	 * RefreshTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayInstruction1
	 * DisplayInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrshTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefreshTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines when to refresh quantity (Immediate or Exhaust)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1083</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayInstruction1, Optional<RefreshTime1Code>> mmRefreshTime = new MMMessageAttribute<DisplayInstruction1, Optional<RefreshTime1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayInstruction1.mmObject();
			isDerived = false;
			xmlTag = "RfrshTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1083"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefreshTime";
			definition = "Defines when to refresh quantity (Immediate or Exhaust).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RefreshTime1Code.mmObject();
		}

		@Override
		public Optional<RefreshTime1Code> getValue(DisplayInstruction1 obj) {
			return obj.getRefreshTime();
		}

		@Override
		public void setValue(DisplayInstruction1 obj, Optional<RefreshTime1Code> value) {
			obj.setRefreshTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisplayInstruction1.mmQuantity, com.tools20022.repository.msg.DisplayInstruction1.mmSecondaryQuantity,
						com.tools20022.repository.msg.DisplayInstruction1.mmMethod, com.tools20022.repository.msg.DisplayInstruction1.mmLowQuantity, com.tools20022.repository.msg.DisplayInstruction1.mmHighQuantity,
						com.tools20022.repository.msg.DisplayInstruction1.mmMinimumIncrement, com.tools20022.repository.msg.DisplayInstruction1.mmRefreshQuantity, com.tools20022.repository.msg.DisplayInstruction1.mmRefreshTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DisplayInstruction1";
				definition = "Provides details about strategy order/Iceberg orders.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantityChoice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public DisplayInstruction1 setQuantity(FinancialInstrumentQuantityChoice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getSecondaryQuantity() {
		return secondaryQuantity == null ? Optional.empty() : Optional.of(secondaryQuantity);
	}

	public DisplayInstruction1 setSecondaryQuantity(FinancialInstrumentQuantityChoice secondaryQuantity) {
		this.secondaryQuantity = secondaryQuantity;
		return this;
	}

	public Optional<DisplayMethod1Code> getMethod() {
		return method == null ? Optional.empty() : Optional.of(method);
	}

	public DisplayInstruction1 setMethod(DisplayMethod1Code method) {
		this.method = method;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getLowQuantity() {
		return lowQuantity == null ? Optional.empty() : Optional.of(lowQuantity);
	}

	public DisplayInstruction1 setLowQuantity(FinancialInstrumentQuantityChoice lowQuantity) {
		this.lowQuantity = lowQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getHighQuantity() {
		return highQuantity == null ? Optional.empty() : Optional.of(highQuantity);
	}

	public DisplayInstruction1 setHighQuantity(FinancialInstrumentQuantityChoice highQuantity) {
		this.highQuantity = highQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMinimumIncrement() {
		return minimumIncrement == null ? Optional.empty() : Optional.of(minimumIncrement);
	}

	public DisplayInstruction1 setMinimumIncrement(FinancialInstrumentQuantityChoice minimumIncrement) {
		this.minimumIncrement = minimumIncrement;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getRefreshQuantity() {
		return refreshQuantity == null ? Optional.empty() : Optional.of(refreshQuantity);
	}

	public DisplayInstruction1 setRefreshQuantity(FinancialInstrumentQuantityChoice refreshQuantity) {
		this.refreshQuantity = refreshQuantity;
		return this;
	}

	public Optional<RefreshTime1Code> getRefreshTime() {
		return refreshTime == null ? Optional.empty() : Optional.of(refreshTime);
	}

	public DisplayInstruction1 setRefreshTime(RefreshTime1Code refreshTime) {
		this.refreshTime = refreshTime;
		return this;
	}
}