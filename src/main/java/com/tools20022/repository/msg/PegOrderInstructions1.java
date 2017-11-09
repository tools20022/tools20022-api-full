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
import com.tools20022.repository.codeset.MoveType1Code;
import com.tools20022.repository.codeset.OffsetType1Code;
import com.tools20022.repository.codeset.PegType1Code;
import com.tools20022.repository.codeset.PriceProtectionScope2Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.SecuritiesPegOrderInstruction;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details about instructions specific to pegged orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmOffset
 * PegOrderInstructions1.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmRelatedPriceType
 * PegOrderInstructions1.mmRelatedPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmMoveType
 * PegOrderInstructions1.mmMoveType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmOffsetType
 * PegOrderInstructions1.mmOffsetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmLimitType
 * PegOrderInstructions1.mmLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmRoundDirection
 * PegOrderInstructions1.mmRoundDirection}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmScope
 * PegOrderInstructions1.mmScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmOffsetSign
 * PegOrderInstructions1.mmOffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmPegSecurityDetails
 * PegOrderInstructions1.mmPegSecurityDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
 * SecuritiesPegOrderInstruction}</li>
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
 * "PegOrderInstructions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about instructions specific to pegged orders."</li>
 * </ul>
 */
public class PegOrderInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount offset;
	/**
	 * Amount added to the peg for a pegged order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffset
	 * SecuritiesPegOrderInstruction.mmOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
	 * definition} = "Amount added to the peg for a pegged order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOffset = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmOffset;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Offset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offset";
			definition = "Amount added to the peg for a pegged order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PegType1Code relatedPriceType;
	/**
	 * Defines the type of peg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PegType1Code
	 * PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmPriceType
	 * SecuritiesPegOrderInstruction.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
	 * definition} = "Defines the type of peg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedPriceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmPriceType;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RltdPricTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPriceType";
			definition = "Defines the type of peg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PegType1Code.mmObject();
		}
	};
	protected MoveType1Code moveType;
	/**
	 * Describes whether peg is static/fixed or floats.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmMoveType
	 * SecuritiesPegOrderInstruction.mmMoveType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
	 * definition} = "Describes whether peg is static/fixed or floats."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMoveType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmMoveType;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "MvTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveType";
			definition = "Describes whether peg is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MoveType1Code.mmObject();
		}
	};
	protected OffsetType1Code offsetType;
	/**
	 * Type of Peg Offset.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffsetType
	 * SecuritiesPegOrderInstruction.mmOffsetType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
	 * definition} = "Type of Peg Offset."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOffsetType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmOffsetType;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetType";
			definition = "Type of Peg Offset.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OffsetType1Code.mmObject();
		}
	};
	protected Max35Text limitType;
	/**
	 * Specifies nature of resulting pegged price (e.g. or better limit, strict
	 * limit etc).
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmLimitType
	 * SecuritiesPegOrderInstruction.mmLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
	 * "Specifies nature of resulting pegged price (e.g. or better limit, strict limit etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmLimitType;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "LmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Specifies nature of resulting pegged price (e.g. or better limit, strict limit etc).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text roundDirection;
	/**
	 * If the calculated peg price is not a valid tick price, specifies how to
	 * round the price (e.g. be more or less aggressive)
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmRoundDirection
	 * SecuritiesPegOrderInstruction.mmRoundDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
	 * "If the calculated peg price is not a valid tick price, specifies how to round the price (e.g. be more or less aggressive)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmRoundDirection;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RndDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated peg price is not a valid tick price, specifies how to round the price (e.g. be more or less aggressive)";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PriceProtectionScope2Code scope;
	/**
	 * The scope of "related to" price of the peg (for example, local, global
	 * etc).
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmScope
	 * SecuritiesPegOrderInstruction.mmScope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
	 * "The scope of \"related to\" price of the peg (for example, local, global etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmScope = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmScope;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Scp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the peg (for example, local, global etc).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceProtectionScope2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffsetSign
	 * SecuritiesPegOrderInstruction.mmOffsetSign}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
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
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmOffsetSign;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetSgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	protected SecurityIdentification7 pegSecurityDetails;
	/**
	 * Provides details about the the security off whose prices the order will
	 * peg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PegSctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PegSecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the the security off whose prices the order will peg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPegSecurityDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "PegSctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PegSecurityDetails";
			definition = "Provides details about the the security off whose prices the order will peg.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PegOrderInstructions1.mmOffset, PegOrderInstructions1.mmRelatedPriceType, PegOrderInstructions1.mmMoveType, PegOrderInstructions1.mmOffsetType, PegOrderInstructions1.mmLimitType,
						PegOrderInstructions1.mmRoundDirection, PegOrderInstructions1.mmScope, PegOrderInstructions1.mmOffsetSign, PegOrderInstructions1.mmPegSecurityDetails);
				trace_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PegOrderInstructions1";
				definition = "Provides details about instructions specific to pegged orders.";
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

	public PegType1Code getRelatedPriceType() {
		return relatedPriceType;
	}

	public void setRelatedPriceType(PegType1Code relatedPriceType) {
		this.relatedPriceType = relatedPriceType;
	}

	public MoveType1Code getMoveType() {
		return moveType;
	}

	public void setMoveType(MoveType1Code moveType) {
		this.moveType = moveType;
	}

	public OffsetType1Code getOffsetType() {
		return offsetType;
	}

	public void setOffsetType(OffsetType1Code offsetType) {
		this.offsetType = offsetType;
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

	public PlusOrMinusIndicator getOffsetSign() {
		return offsetSign;
	}

	public void setOffsetSign(PlusOrMinusIndicator offsetSign) {
		this.offsetSign = offsetSign;
	}

	public SecurityIdentification7 getPegSecurityDetails() {
		return pegSecurityDetails;
	}

	public void setPegSecurityDetails(com.tools20022.repository.msg.SecurityIdentification7 pegSecurityDetails) {
		this.pegSecurityDetails = pegSecurityDetails;
	}
}