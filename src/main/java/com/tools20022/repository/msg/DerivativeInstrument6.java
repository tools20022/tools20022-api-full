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
import com.tools20022.repository.choice.AssetClassAttributes1Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice;
import com.tools20022.repository.choice.UnderlyingIdentification2Choice;
import com.tools20022.repository.codeset.OptionStyle7Code;
import com.tools20022.repository.codeset.OptionType2Code;
import com.tools20022.repository.codeset.PhysicalTransferType4Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.NonNegativeDecimalNumber;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Option;
import com.tools20022.repository.entity.SecuritiesTransfer;
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
 * Specifies the derivative instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmExpiryDate
 * DerivativeInstrument6.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmPriceMultiplier
 * DerivativeInstrument6.mmPriceMultiplier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmUnderlyingInstrument
 * DerivativeInstrument6.mmUnderlyingInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmOptionType
 * DerivativeInstrument6.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmStrikePrice
 * DerivativeInstrument6.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmOptionExerciseStyle
 * DerivativeInstrument6.mmOptionExerciseStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmDeliveryType
 * DerivativeInstrument6.mmDeliveryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmAssetClassSpecificAttributes
 * DerivativeInstrument6.mmAssetClassSpecificAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DerivativeInstrument6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the derivative instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DerivativeInstrument6", propOrder = {"expiryDate", "priceMultiplier", "underlyingInstrument", "optionType", "strikePrice", "optionExerciseStyle", "deliveryType", "assetClassSpecificAttributes"})
public class DerivativeInstrument6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XpryDt")
	protected ISODate expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExerciseDate
	 * Derivative.mmExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original expiry date of the reported financial instrument. \r\n\r\nUsage:\r\nField applies to derivatives with defined expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeInstrument6, Optional<ISODate>> mmExpiryDate = new MMMessageAttribute<DerivativeInstrument6, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExerciseDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Original expiry date of the reported financial instrument. \r\n\r\nUsage:\r\nField applies to derivatives with defined expiry date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DerivativeInstrument6 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, Optional<ISODate> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PricMltplr", required = true)
	protected NonNegativeDecimalNumber priceMultiplier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NonNegativeDecimalNumber
	 * NonNegativeDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikeMultiplier
	 * Option.mmStrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMltplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
	 * constraint} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMultiplierRule#forDerivativeInstrument6_PriceMultiplier
	 * ConstraintMultiplierRule.forDerivativeInstrument6_PriceMultiplier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of the underlying instrument represented by a single derivative contract.\r\n\r\nFor a future or option on an index, the amount per index point."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeInstrument6, NonNegativeDecimalNumber> mmPriceMultiplier = new MMMessageAttribute<DerivativeInstrument6, NonNegativeDecimalNumber>() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikeMultiplier;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "PricMltplr";
			constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMultiplierRule.forDerivativeInstrument6_PriceMultiplier);
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMultiplier";
			definition = "Number of units of the underlying instrument represented by a single derivative contract.\r\n\r\nFor a future or option on an index, the amount per index point.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NonNegativeDecimalNumber.mmObject();
		}

		@Override
		public NonNegativeDecimalNumber getValue(DerivativeInstrument6 obj) {
			return obj.getPriceMultiplier();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, NonNegativeDecimalNumber value) {
			obj.setPriceMultiplier(value);
		}
	};
	@XmlElement(name = "UndrlygInstrm", required = true)
	protected UnderlyingIdentification2Choice underlyingInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingIdentification2Choice
	 * UnderlyingIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice to specify the type(s) of underlying instrument(s) that make up the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DerivativeInstrument6, UnderlyingIdentification2Choice> mmUnderlyingInstrument = new MMMessageAssociationEnd<DerivativeInstrument6, UnderlyingIdentification2Choice>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "UndrlygInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingInstrument";
			definition = "Choice to specify the type(s) of underlying instrument(s) that make up the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingIdentification2Choice.mmObject();
		}

		@Override
		public UnderlyingIdentification2Choice getValue(DerivativeInstrument6 obj) {
			return obj.getUnderlyingInstrument();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, UnderlyingIdentification2Choice value) {
			obj.setUnderlyingInstrument(value);
		}
	};
	@XmlElement(name = "OptnTp")
	protected OptionType2Code optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionType2Code
	 * OptionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionType
	 * Option.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeInstrument6, Optional<OptionType2Code>> mmOptionType = new MMMessageAttribute<DerivativeInstrument6, Optional<OptionType2Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OptionType2Code.mmObject();
		}

		@Override
		public Optional<OptionType2Code> getValue(DerivativeInstrument6 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, Optional<OptionType2Code> value) {
			obj.setOptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "StrkPric")
	protected SecuritiesTransactionPrice4Choice strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice
	 * SecuritiesTransactionPrice4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
	 * Option.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeInstrument6, Optional<SecuritiesTransactionPrice4Choice>> mmStrikePrice = new MMMessageAttribute<DerivativeInstrument6, Optional<SecuritiesTransactionPrice4Choice>>() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionPrice4Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionPrice4Choice> getValue(DerivativeInstrument6 obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, Optional<SecuritiesTransactionPrice4Choice> value) {
			obj.setStrikePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnExrcStyle")
	protected OptionStyle7Code optionExerciseStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle7Code
	 * OptionStyle7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnExrcStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionExerciseStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether the option may be exercised only at a fixed date (European, and Asian style), a series of pre-specified dates (Bermudan) or at any time during the life of the contract (American style). This field does not have to be populated for ISIN instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeInstrument6, Optional<OptionStyle7Code>> mmOptionExerciseStyle = new MMMessageAttribute<DerivativeInstrument6, Optional<OptionStyle7Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "OptnExrcStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionExerciseStyle";
			definition = "Indication as to whether the option may be exercised only at a fixed date (European, and Asian style), a series of pre-specified dates (Bermudan) or at any time during the life of the contract (American style). This field does not have to be populated for ISIN instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OptionStyle7Code.mmObject();
		}

		@Override
		public Optional<OptionStyle7Code> getValue(DerivativeInstrument6 obj) {
			return obj.getOptionExerciseStyle();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, Optional<OptionStyle7Code> value) {
			obj.setOptionExerciseStyle(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryTp", required = true)
	protected PhysicalTransferType4Code deliveryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
	 * PhysicalTransferType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is settled physically or in cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DerivativeInstrument6, PhysicalTransferType4Code> mmDeliveryType = new MMMessageAttribute<DerivativeInstrument6, PhysicalTransferType4Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "DlvryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryType";
			definition = "Indicates whether the transaction is settled physically or in cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhysicalTransferType4Code.mmObject();
		}

		@Override
		public PhysicalTransferType4Code getValue(DerivativeInstrument6 obj) {
			return obj.getDeliveryType();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, PhysicalTransferType4Code value) {
			obj.setDeliveryType(value);
		}
	};
	@XmlElement(name = "AsstClssSpcfcAttrbts")
	protected AssetClassAttributes1Choice assetClassSpecificAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice
	 * AssetClassAttributes1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6
	 * DerivativeInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstClssSpcfcAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassSpecificAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific attributes of the underlying asset class of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DerivativeInstrument6, Optional<AssetClassAttributes1Choice>> mmAssetClassSpecificAttributes = new MMMessageAssociationEnd<DerivativeInstrument6, Optional<AssetClassAttributes1Choice>>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeInstrument6.mmObject();
			isDerived = false;
			xmlTag = "AsstClssSpcfcAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClassSpecificAttributes";
			definition = "Specific attributes of the underlying asset class of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AssetClassAttributes1Choice.mmObject();
		}

		@Override
		public Optional<AssetClassAttributes1Choice> getValue(DerivativeInstrument6 obj) {
			return obj.getAssetClassSpecificAttributes();
		}

		@Override
		public void setValue(DerivativeInstrument6 obj, Optional<AssetClassAttributes1Choice> value) {
			obj.setAssetClassSpecificAttributes(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeInstrument6.mmExpiryDate, com.tools20022.repository.msg.DerivativeInstrument6.mmPriceMultiplier,
						com.tools20022.repository.msg.DerivativeInstrument6.mmUnderlyingInstrument, com.tools20022.repository.msg.DerivativeInstrument6.mmOptionType, com.tools20022.repository.msg.DerivativeInstrument6.mmStrikePrice,
						com.tools20022.repository.msg.DerivativeInstrument6.mmOptionExerciseStyle, com.tools20022.repository.msg.DerivativeInstrument6.mmDeliveryType,
						com.tools20022.repository.msg.DerivativeInstrument6.mmAssetClassSpecificAttributes);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeInstrument6";
				definition = "Specifies the derivative instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public DerivativeInstrument6 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public NonNegativeDecimalNumber getPriceMultiplier() {
		return priceMultiplier;
	}

	public DerivativeInstrument6 setPriceMultiplier(NonNegativeDecimalNumber priceMultiplier) {
		this.priceMultiplier = Objects.requireNonNull(priceMultiplier);
		return this;
	}

	public UnderlyingIdentification2Choice getUnderlyingInstrument() {
		return underlyingInstrument;
	}

	public DerivativeInstrument6 setUnderlyingInstrument(UnderlyingIdentification2Choice underlyingInstrument) {
		this.underlyingInstrument = Objects.requireNonNull(underlyingInstrument);
		return this;
	}

	public Optional<OptionType2Code> getOptionType() {
		return optionType == null ? Optional.empty() : Optional.of(optionType);
	}

	public DerivativeInstrument6 setOptionType(OptionType2Code optionType) {
		this.optionType = optionType;
		return this;
	}

	public Optional<SecuritiesTransactionPrice4Choice> getStrikePrice() {
		return strikePrice == null ? Optional.empty() : Optional.of(strikePrice);
	}

	public DerivativeInstrument6 setStrikePrice(SecuritiesTransactionPrice4Choice strikePrice) {
		this.strikePrice = strikePrice;
		return this;
	}

	public Optional<OptionStyle7Code> getOptionExerciseStyle() {
		return optionExerciseStyle == null ? Optional.empty() : Optional.of(optionExerciseStyle);
	}

	public DerivativeInstrument6 setOptionExerciseStyle(OptionStyle7Code optionExerciseStyle) {
		this.optionExerciseStyle = optionExerciseStyle;
		return this;
	}

	public PhysicalTransferType4Code getDeliveryType() {
		return deliveryType;
	}

	public DerivativeInstrument6 setDeliveryType(PhysicalTransferType4Code deliveryType) {
		this.deliveryType = Objects.requireNonNull(deliveryType);
		return this;
	}

	public Optional<AssetClassAttributes1Choice> getAssetClassSpecificAttributes() {
		return assetClassSpecificAttributes == null ? Optional.empty() : Optional.of(assetClassSpecificAttributes);
	}

	public DerivativeInstrument6 setAssetClassSpecificAttributes(AssetClassAttributes1Choice assetClassSpecificAttributes) {
		this.assetClassSpecificAttributes = assetClassSpecificAttributes;
		return this;
	}
}