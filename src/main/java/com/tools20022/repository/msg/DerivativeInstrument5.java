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
import com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice;
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
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmExpiryDate
 * DerivativeInstrument5.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmPriceMultiplier
 * DerivativeInstrument5.mmPriceMultiplier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmUnderlyingInstrument
 * DerivativeInstrument5.mmUnderlyingInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmOptionType
 * DerivativeInstrument5.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmStrikePrice
 * DerivativeInstrument5.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmOptionExerciseStyle
 * DerivativeInstrument5.mmOptionExerciseStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmDeliveryType
 * DerivativeInstrument5.mmDeliveryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmAssetClassSpecificAttributes
 * DerivativeInstrument5.mmAssetClassSpecificAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "DerivativeInstrument5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the derivative instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DerivativeInstrument5", propOrder = {"expiryDate", "priceMultiplier", "underlyingInstrument", "optionType", "strikePrice", "optionExerciseStyle", "deliveryType", "assetClassSpecificAttributes"})
public class DerivativeInstrument5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate expiryDate;
	/**
	 * Expiry date of the financial instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
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
	 * definition} = "Expiry date of the financial instrument. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExerciseDate;
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Expiry date of the financial instrument. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected NonNegativeDecimalNumber priceMultiplier;
	/**
	 * Number of units of the underlying instrument represented by a single
	 * derivative contract. For a future or option on an index, the amount per
	 * index point.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMltplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of the underlying instrument represented by a single derivative contract. For a future or option on an index, the amount per index point."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceMultiplier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikeMultiplier;
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "PricMltplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMultiplier";
			definition = "Number of units of the underlying instrument represented by a single derivative contract. For a future or option on an index, the amount per index point.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NonNegativeDecimalNumber.mmObject();
		}
	};
	protected FinancialInstrumentIdentification5Choice underlyingInstrument;
	/**
	 * Choice to specify the type(s) of underlying instrument(s) that make up
	 * the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice
	 * FinancialInstrumentIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
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
	public static final MMMessageAssociationEnd mmUnderlyingInstrument = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "UndrlygInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingInstrument";
			definition = "Choice to specify the type(s) of underlying instrument(s) that make up the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentIdentification5Choice.mmObject();
		}
	};
	protected OptionType2Code optionType;
	/**
	 * Specifies whether it is a call option (right to purchase a specific
	 * underlying asset) or a put option (right to sell a specific underlying
	 * asset).<br>
	 * <br>
	 * Usage:<br>
	 * Within the scope of MiFIR, RTS 23, the following meanings should be used
	 * where a swaption is being detailed, “Put”, in case of receiver swaption,
	 * in which the buyer has the right to enter into a swap as a fixed-rate
	 * receiver. Call”, in case of payer swaption, in which the buyer has the
	 * right to enter into a swap as a fixed-rate payer. Caps and floors shall
	 * interpret this field as, "Put”, in case of a Floor, "Call”, in case of a
	 * Cap. Field only applies to derivatives that are options or warrants.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
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
	 * "Specifies whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset).\r\n\r\nUsage:\r\nWithin the scope of MiFIR, RTS 23, the following meanings should be used where a swaption is being detailed, “Put”, in case of receiver swaption, in which the buyer has the right to enter into a swap as a fixed-rate receiver. Call”, in case of payer swaption, in which the buyer has the right to enter into a swap as a fixed-rate payer. Caps and floors shall interpret this field as, \"Put”, in case of a Floor, \"Call”, in case of a Cap. Field only applies to derivatives that are options or warrants."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset).\r\n\r\nUsage:\r\nWithin the scope of MiFIR, RTS 23, the following meanings should be used where a swaption is being detailed, “Put”, in case of receiver swaption, in which the buyer has the right to enter into a swap as a fixed-rate receiver. Call”, in case of payer swaption, in which the buyer has the right to enter into a swap as a fixed-rate payer. Caps and floors shall interpret this field as, \"Put”, in case of a Floor, \"Call”, in case of a Cap. Field only applies to derivatives that are options or warrants.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OptionType2Code.mmObject();
		}
	};
	protected SecuritiesTransactionPrice4Choice strikePrice;
	/**
	 * Attributes to specify the strike price of a derivative.<br>
	 * <br>
	 * Usage:<br>
	 * Within the scope of MiFIR RTS 23, these are the fields 31 and 32. This
	 * field only applies to options, warrants, spread bet on an option on an
	 * equity or contract for difference on an option on an equity. Where price
	 * is currently not available but pending, the value shall be ’PNDG’. Where
	 * strike price is not applicable it shall not be populated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
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
	 * "Attributes to specify the strike price of a derivative.\r\n\r\nUsage:\r\nWithin the scope of MiFIR RTS 23, these are the fields 31 and 32. This field only applies to options, warrants, spread bet on an option on an equity or contract for difference on an option on an equity. Where price is currently not available but pending, the value shall be ’PNDG’. Where strike price is not applicable it shall not be populated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStrikePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikePrice;
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Attributes to specify the strike price of a derivative.\r\n\r\nUsage:\r\nWithin the scope of MiFIR RTS 23, these are the fields 31 and 32. This field only applies to options, warrants, spread bet on an option on an equity or contract for difference on an option on an equity. Where price is currently not available but pending, the value shall be ’PNDG’. Where strike price is not applicable it shall not be populated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionPrice4Choice.mmObject();
		}
	};
	protected OptionStyle7Code optionExerciseStyle;
	/**
	 * Indication as to whether the option may be exercised only at a fixed date
	 * (European, and Asian style), a series of pre-specified dates (Bermudan)
	 * or at any time during the life of the contract (American style).<br>
	 * <br>
	 * Usage:<br>
	 * Within the scope of MiFIR, RTS 23, this field is only applicable for
	 * options, warrants and entitlement certificates.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
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
	 * "Indication as to whether the option may be exercised only at a fixed date (European, and Asian style), a series of pre-specified dates (Bermudan) or at any time during the life of the contract (American style).\r\n\r\nUsage:\r\nWithin the scope of MiFIR, RTS 23, this field is only applicable for options, warrants and entitlement certificates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionExerciseStyle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "OptnExrcStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionExerciseStyle";
			definition = "Indication as to whether the option may be exercised only at a fixed date (European, and Asian style), a series of pre-specified dates (Bermudan) or at any time during the life of the contract (American style).\r\n\r\nUsage:\r\nWithin the scope of MiFIR, RTS 23, this field is only applicable for options, warrants and entitlement certificates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OptionStyle7Code.mmObject();
		}
	};
	protected PhysicalTransferType4Code deliveryType;
	/**
	 * Indicates whether the transaction is settled physically or in cash.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
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
	public static final MMMessageAttribute mmDeliveryType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "DlvryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryType";
			definition = "Indicates whether the transaction is settled physically or in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhysicalTransferType4Code.mmObject();
		}
	};
	protected AssetClass2 assetClassSpecificAttributes;
	/**
	 * Specific attributes of the underlying asset class of the financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AssetClass2
	 * AssetClass2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
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
	public static final MMMessageAssociationEnd mmAssetClassSpecificAttributes = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DerivativeInstrument5.mmObject();
			isDerived = false;
			xmlTag = "AsstClssSpcfcAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClassSpecificAttributes";
			definition = "Specific attributes of the underlying asset class of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AssetClass2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DerivativeInstrument5.mmExpiryDate, DerivativeInstrument5.mmPriceMultiplier, DerivativeInstrument5.mmUnderlyingInstrument, DerivativeInstrument5.mmOptionType,
						DerivativeInstrument5.mmStrikePrice, DerivativeInstrument5.mmOptionExerciseStyle, DerivativeInstrument5.mmDeliveryType, DerivativeInstrument5.mmAssetClassSpecificAttributes);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeInstrument5";
				definition = "Specifies the derivative instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "XpryDt")
	public ISODate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@XmlElement(name = "PricMltplr")
	public NonNegativeDecimalNumber getPriceMultiplier() {
		return priceMultiplier;
	}

	public void setPriceMultiplier(NonNegativeDecimalNumber priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}

	@XmlElement(name = "UndrlygInstrm")
	public FinancialInstrumentIdentification5Choice getUnderlyingInstrument() {
		return underlyingInstrument;
	}

	public void setUnderlyingInstrument(FinancialInstrumentIdentification5Choice underlyingInstrument) {
		this.underlyingInstrument = underlyingInstrument;
	}

	@XmlElement(name = "OptnTp")
	public OptionType2Code getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionType2Code optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "StrkPric")
	public SecuritiesTransactionPrice4Choice getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(SecuritiesTransactionPrice4Choice strikePrice) {
		this.strikePrice = strikePrice;
	}

	@XmlElement(name = "OptnExrcStyle")
	public OptionStyle7Code getOptionExerciseStyle() {
		return optionExerciseStyle;
	}

	public void setOptionExerciseStyle(OptionStyle7Code optionExerciseStyle) {
		this.optionExerciseStyle = optionExerciseStyle;
	}

	@XmlElement(name = "DlvryTp")
	public PhysicalTransferType4Code getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(PhysicalTransferType4Code deliveryType) {
		this.deliveryType = deliveryType;
	}

	@XmlElement(name = "AsstClssSpcfcAttrbts")
	public AssetClass2 getAssetClassSpecificAttributes() {
		return assetClassSpecificAttributes;
	}

	public void setAssetClassSpecificAttributes(com.tools20022.repository.msg.AssetClass2 assetClassSpecificAttributes) {
		this.assetClassSpecificAttributes = assetClassSpecificAttributes;
	}
}