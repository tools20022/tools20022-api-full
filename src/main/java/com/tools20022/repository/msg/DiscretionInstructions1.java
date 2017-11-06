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
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmOffset
 * DiscretionInstructions1.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmOffsetSign
 * DiscretionInstructions1.mmOffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmRelatedPriceType
 * DiscretionInstructions1.mmRelatedPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmMoveType
 * DiscretionInstructions1.mmMoveType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmLimitType
 * DiscretionInstructions1.mmLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmRoundDirection
 * DiscretionInstructions1.mmRoundDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmScope
 * DiscretionInstructions1.mmScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmOffsetType
 * DiscretionInstructions1.mmOffsetType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
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
 * "DiscretionInstructions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price."
 * </li>
 * </ul>
 */
public class DiscretionInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount offset;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmOffset
	 * Discretion.mmOffset}</li>
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
	public static final MMMessageAttribute mmOffset = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmOffset;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Offset";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offset";
			definition = "Information for the executing party about the price to be obtained for an order. It is expressed as an offset from a reference price such as the market price or last trade price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PlusOrMinusIndicator offsetSign;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmOffsetSign
	 * Discretion.mmOffsetSign}</li>
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
	public static final MMMessageAttribute mmOffsetSign = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmOffsetSign;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetSgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	protected TypeOfDiscretionPrice1Code relatedPriceType;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedPriceType
	 * Discretion.mmRelatedPriceType}</li>
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
	public static final MMMessageAttribute mmRelatedPriceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmRelatedPriceType;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RltdPricTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPriceType";
			definition = "Identify the type of price an offset is related to. The offset can either be added or subtracted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}
	};
	protected MoveType1Code moveType;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmMoveType
	 * Discretion.mmMoveType}</li>
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
	public static final MMMessageAttribute mmMoveType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmMoveType;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "MvTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveType";
			definition = "Describes whether discretion price is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoveType1Code.mmObject();
		}
	};
	protected Max35Text limitType;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmLimitType
	 * Discretion.mmLimitType}</li>
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
	public static final MMMessageAttribute mmLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmLimitType;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "LmtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text roundDirection;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmRoundDirection
	 * Discretion.mmRoundDirection}</li>
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
	public static final MMMessageAttribute mmRoundDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmRoundDirection;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RndDrctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PriceProtectionScope2Code scope;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmScope
	 * Discretion.mmScope}</li>
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
	public static final MMMessageAttribute mmScope = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmScope;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Scp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the discretion (e.g. local, global etc)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScope2Code.mmObject();
		}
	};
	protected OffsetType1Code offsetType;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmOffsetType
	 * Discretion.mmOffsetType}</li>
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
	public static final MMMessageAttribute mmOffsetType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discretion.mmOffsetType;
			componentContext_lazy = () -> DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetType";
			definition = "Describes the type of Discretion Offset .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffsetType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DiscretionInstructions1.mmOffset, com.tools20022.repository.msg.DiscretionInstructions1.mmOffsetSign,
						com.tools20022.repository.msg.DiscretionInstructions1.mmRelatedPriceType, com.tools20022.repository.msg.DiscretionInstructions1.mmMoveType, com.tools20022.repository.msg.DiscretionInstructions1.mmLimitType,
						com.tools20022.repository.msg.DiscretionInstructions1.mmRoundDirection, com.tools20022.repository.msg.DiscretionInstructions1.mmScope, com.tools20022.repository.msg.DiscretionInstructions1.mmOffsetType);
				trace_lazy = () -> Discretion.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DiscretionInstructions1";
				definition = "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getOffset() {
		return offset;
	}

	public void setOffset(ActiveCurrencyAndAmount offset) {
		this.offset = offset;
	}

	public PlusOrMinusIndicator getOffsetSign() {
		return offsetSign;
	}

	public void setOffsetSign(PlusOrMinusIndicator offsetSign) {
		this.offsetSign = offsetSign;
	}

	public TypeOfDiscretionPrice1Code getRelatedPriceType() {
		return relatedPriceType;
	}

	public void setRelatedPriceType(TypeOfDiscretionPrice1Code relatedPriceType) {
		this.relatedPriceType = relatedPriceType;
	}

	public MoveType1Code getMoveType() {
		return moveType;
	}

	public void setMoveType(MoveType1Code moveType) {
		this.moveType = moveType;
	}

	public Max35Text getLimitType() {
		return limitType;
	}

	public void setLimitType(Max35Text limitType) {
		this.limitType = limitType;
	}

	public Max35Text getRoundDirection() {
		return roundDirection;
	}

	public void setRoundDirection(Max35Text roundDirection) {
		this.roundDirection = roundDirection;
	}

	public PriceProtectionScope2Code getScope() {
		return scope;
	}

	public void setScope(PriceProtectionScope2Code scope) {
		this.scope = scope;
	}

	public OffsetType1Code getOffsetType() {
		return offsetType;
	}

	public void setOffsetType(OffsetType1Code offsetType) {
		this.offsetType = offsetType;
	}
}