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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecuritiesTransactionPrice9Choice;
import com.tools20022.repository.codeset.OptionStyle6Code;
import com.tools20022.repository.codeset.OptionType2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Option;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Option or swaption related attributes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OptionOrSwaption6#mmOptionType
 * OptionOrSwaption6.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6#mmStrikePrice
 * OptionOrSwaption6.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6#mmOptionExerciseStyle
 * OptionOrSwaption6.mmOptionExerciseStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6#mmMaturityDateOfUnderlying
 * OptionOrSwaption6.mmMaturityDateOfUnderlying}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionOrSwaption6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Option or swaption related attributes."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forOptionOrSwaption6
 * ConstraintOneElementPresentRule.forOptionOrSwaption6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OptionOrSwaption6", propOrder = {"optionType", "strikePrice", "optionExerciseStyle", "maturityDateOfUnderlying"})
public class OptionOrSwaption6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6
	 * OptionOrSwaption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the Option whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset).\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionOrSwaption6, Optional<OptionType2Code>> mmOptionType = new MMMessageAttribute<OptionOrSwaption6, Optional<OptionType2Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionOrSwaption6.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the type of the Option whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset).\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OptionType2Code.mmObject();
		}

		@Override
		public Optional<OptionType2Code> getValue(OptionOrSwaption6 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(OptionOrSwaption6 obj, Optional<OptionType2Code> value) {
			obj.setOptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "StrkPric")
	protected SecuritiesTransactionPrice9Choice strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice9Choice
	 * SecuritiesTransactionPrice9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
	 * Option.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6
	 * OptionOrSwaption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionOrSwaption6, Optional<SecuritiesTransactionPrice9Choice>> mmStrikePrice = new MMMessageAttribute<OptionOrSwaption6, Optional<SecuritiesTransactionPrice9Choice>>() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionOrSwaption6.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionPrice9Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionPrice9Choice> getValue(OptionOrSwaption6 obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(OptionOrSwaption6 obj, Optional<SecuritiesTransactionPrice9Choice> value) {
			obj.setStrikePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnExrcStyle")
	protected List<OptionStyle6Code> optionExerciseStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle6Code
	 * OptionStyle6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6
	 * OptionOrSwaption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnExrcStyle"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionExerciseStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication as to whether the option may be exercised only at a fixed date (European, and Asian style), a series of pre-specified dates (Bermudan) or at any time during the life of the contract (American style). This field does not have to be populated for ISIN instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionOrSwaption6, List<OptionStyle6Code>> mmOptionExerciseStyle = new MMMessageAttribute<OptionOrSwaption6, List<OptionStyle6Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionOrSwaption6.mmObject();
			isDerived = false;
			xmlTag = "OptnExrcStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionExerciseStyle";
			definition = "Indication as to whether the option may be exercised only at a fixed date (European, and Asian style), a series of pre-specified dates (Bermudan) or at any time during the life of the contract (American style). This field does not have to be populated for ISIN instruments.";
			minOccurs = 0;
			simpleType_lazy = () -> OptionStyle6Code.mmObject();
		}

		@Override
		public List<OptionStyle6Code> getValue(OptionOrSwaption6 obj) {
			return obj.getOptionExerciseStyle();
		}

		@Override
		public void setValue(OptionOrSwaption6 obj, List<OptionStyle6Code> value) {
			obj.setOptionExerciseStyle(value);
		}
	};
	@XmlElement(name = "MtrtyDtOfUndrlyg")
	protected ISODate maturityDateOfUnderlying;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6
	 * OptionOrSwaption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDtOfUndrlyg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateOfUnderlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of swaptions, maturity date of the underlying swap."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionOrSwaption6, Optional<ISODate>> mmMaturityDateOfUnderlying = new MMMessageAttribute<OptionOrSwaption6, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionOrSwaption6.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDtOfUndrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDateOfUnderlying";
			definition = "In case of swaptions, maturity date of the underlying swap.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(OptionOrSwaption6 obj) {
			return obj.getMaturityDateOfUnderlying();
		}

		@Override
		public void setValue(OptionOrSwaption6 obj, Optional<ISODate> value) {
			obj.setMaturityDateOfUnderlying(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OptionOrSwaption6.mmOptionType, com.tools20022.repository.msg.OptionOrSwaption6.mmStrikePrice,
						com.tools20022.repository.msg.OptionOrSwaption6.mmOptionExerciseStyle, com.tools20022.repository.msg.OptionOrSwaption6.mmMaturityDateOfUnderlying);
				trace_lazy = () -> Option.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forOptionOrSwaption6);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OptionOrSwaption6";
				definition = "Option or swaption related attributes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OptionType2Code> getOptionType() {
		return optionType == null ? Optional.empty() : Optional.of(optionType);
	}

	public OptionOrSwaption6 setOptionType(OptionType2Code optionType) {
		this.optionType = optionType;
		return this;
	}

	public Optional<SecuritiesTransactionPrice9Choice> getStrikePrice() {
		return strikePrice == null ? Optional.empty() : Optional.of(strikePrice);
	}

	public OptionOrSwaption6 setStrikePrice(SecuritiesTransactionPrice9Choice strikePrice) {
		this.strikePrice = strikePrice;
		return this;
	}

	public List<OptionStyle6Code> getOptionExerciseStyle() {
		return optionExerciseStyle == null ? optionExerciseStyle = new ArrayList<>() : optionExerciseStyle;
	}

	public OptionOrSwaption6 setOptionExerciseStyle(List<OptionStyle6Code> optionExerciseStyle) {
		this.optionExerciseStyle = Objects.requireNonNull(optionExerciseStyle);
		return this;
	}

	public Optional<ISODate> getMaturityDateOfUnderlying() {
		return maturityDateOfUnderlying == null ? Optional.empty() : Optional.of(maturityDateOfUnderlying);
	}

	public OptionOrSwaption6 setMaturityDateOfUnderlying(ISODate maturityDateOfUnderlying) {
		this.maturityDateOfUnderlying = maturityDateOfUnderlying;
		return this;
	}
}