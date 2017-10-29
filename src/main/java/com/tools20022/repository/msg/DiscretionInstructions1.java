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
import com.tools20022.repository.codeset.MoveType1Code;
import com.tools20022.repository.codeset.OffsetType1Code;
import com.tools20022.repository.codeset.PriceProtectionScope2Code;
import com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.Discretion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates on an order that the trader wishes to display one price in the
 * market but will accept trades at another price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DiscretionInstructions1#Offset
 * DiscretionInstructions1.Offset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#OffsetSign
 * DiscretionInstructions1.OffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#RelatedPriceType
 * DiscretionInstructions1.RelatedPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#MoveType
 * DiscretionInstructions1.MoveType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#LimitType
 * DiscretionInstructions1.LimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#RoundDirection
 * DiscretionInstructions1.RoundDirection}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DiscretionInstructions1#Scope
 * DiscretionInstructions1.Scope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#OffsetType
 * DiscretionInstructions1.OffsetType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
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
 * "DiscretionInstructions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price."
 * </li>
 * </ul>
 */
public class DiscretionInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Information for the executing party about the price to be obtained for an
	 * order. It is expressed as an offset from a reference price such as the
	 * market price or last trade price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#Offset
	 * Discretion.Offset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information for the executing party about the price to be obtained for an order. It is expressed as an offset from a reference price such as the market price or last trade price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Offset = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.Offset;
			isDerived = false;
			xmlTag = "Offset";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offset";
			definition = "Information for the executing party about the price to be obtained for an order. It is expressed as an offset from a reference price such as the market price or last trade price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the offset should be added or subtracted from the
	 * related price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#OffsetSign
	 * Discretion.OffsetSign}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffsetSgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset should be added or subtracted from the related price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute OffsetSign = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.OffsetSign;
			isDerived = false;
			xmlTag = "OffsetSgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Identify the type of price an offset is related to. The offset can either
	 * be added or subtracted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#RelatedPriceType
	 * Discretion.RelatedPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify the type of price an offset is related to. The offset can either be added or subtracted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RelatedPriceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.RelatedPriceType;
			isDerived = false;
			xmlTag = "RltdPricTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPriceType";
			definition = "Identify the type of price an offset is related to. The offset can either be added or subtracted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	/**
	 * Describes whether discretion price is static/fixed or floats.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoveType1Code
	 * MoveType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#MoveType
	 * Discretion.MoveType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes whether discretion price is static/fixed or floats."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MoveType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.MoveType;
			isDerived = false;
			xmlTag = "MvTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveType";
			definition = "Describes whether discretion price is static/fixed or floats.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MoveType1Code.mmObject();
		}
	};
	/**
	 * Specifies the nature of the resulting discretion price (e.g. or better
	 * limit, strict limit etc).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#LimitType
	 * Discretion.LimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute LimitType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.LimitType;
			isDerived = false;
			xmlTag = "LmtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * If the calculated discretion price is not a valid tick price, specifies
	 * how to round the price (e.g. to be more or less aggressive)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#RoundDirection
	 * Discretion.RoundDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute RoundDirection = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.RoundDirection;
			isDerived = false;
			xmlTag = "RndDrctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * The scope of "related to" price of the discretion (e.g. local, global
	 * etc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code
	 * PriceProtectionScope2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#Scope
	 * Discretion.Scope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The scope of \"related to\" price of the discretion (e.g. local, global etc)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Scope = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.Scope;
			isDerived = false;
			xmlTag = "Scp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the discretion (e.g. local, global etc)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScope2Code.mmObject();
		}
	};
	/**
	 * Describes the type of Discretion Offset .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetType1Code
	 * OffsetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#OffsetType
	 * Discretion.OffsetType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffsetTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the type of Discretion Offset ."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OffsetType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.OffsetType;
			isDerived = false;
			xmlTag = "OffsetTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetType";
			definition = "Describes the type of Discretion Offset .";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OffsetType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DiscretionInstructions1.Offset, com.tools20022.repository.msg.DiscretionInstructions1.OffsetSign,
						com.tools20022.repository.msg.DiscretionInstructions1.RelatedPriceType, com.tools20022.repository.msg.DiscretionInstructions1.MoveType, com.tools20022.repository.msg.DiscretionInstructions1.LimitType,
						com.tools20022.repository.msg.DiscretionInstructions1.RoundDirection, com.tools20022.repository.msg.DiscretionInstructions1.Scope, com.tools20022.repository.msg.DiscretionInstructions1.OffsetType);
				trace_lazy = () -> Discretion.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DiscretionInstructions1";
				definition = "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price.";
			}
		});
		return mmObject_lazy.get();
	}
}