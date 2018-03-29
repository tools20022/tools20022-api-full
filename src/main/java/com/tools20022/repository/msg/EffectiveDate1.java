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
import com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionV01;
import com.tools20022.repository.codeset.ExternalEffectiveDateParameter1Code;
import com.tools20022.repository.datatype.ISODate;
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
 * Date and date parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EffectiveDate1#mmEffectiveDate
 * EffectiveDate1.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EffectiveDate1#mmEffectiveDateParameter
 * EffectiveDate1.mmEffectiveDateParameter}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmEffectiveDateDetails
 * StandingSettlementInstructionV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01#mmEffectiveDateDetails
 * StandingSettlementInstructionCancellationV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmEffectiveDateDetails
 * StandingSettlementInstructionStatusAdviceV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmEffectiveDateDetails
 * StandingSettlementInstructionDeletionV01.mmEffectiveDateDetails}</li>
 * </ul>
 * </li>
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
 * "EffectiveDate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Date and date parameters."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EffectiveDate1", propOrder = {"effectiveDate", "effectiveDateParameter"})
public class EffectiveDate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FctvDt", required = true)
	protected ISODate effectiveDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EffectiveDate1 EffectiveDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the SSI is effective. If the SSI is effective on a future date, then the date must be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EffectiveDate1, ISODate> mmEffectiveDate = new MMMessageAttribute<EffectiveDate1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EffectiveDate1.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date on which the SSI is effective. If the SSI is effective on a future date, then the date must be provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(EffectiveDate1 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(EffectiveDate1 obj, ISODate value) {
			obj.setEffectiveDate(value);
		}
	};
	@XmlElement(name = "FctvDtParam")
	protected ExternalEffectiveDateParameter1Code effectiveDateParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalEffectiveDateParameter1Code
	 * ExternalEffectiveDateParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EffectiveDate1 EffectiveDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDtParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the SSI update effective date is to be applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EffectiveDate1, Optional<ExternalEffectiveDateParameter1Code>> mmEffectiveDateParameter = new MMMessageAttribute<EffectiveDate1, Optional<ExternalEffectiveDateParameter1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EffectiveDate1.mmObject();
			isDerived = false;
			xmlTag = "FctvDtParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateParameter";
			definition = "Specifies how the SSI update effective date is to be applied.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalEffectiveDateParameter1Code.mmObject();
		}

		@Override
		public Optional<ExternalEffectiveDateParameter1Code> getValue(EffectiveDate1 obj) {
			return obj.getEffectiveDateParameter();
		}

		@Override
		public void setValue(EffectiveDate1 obj, Optional<ExternalEffectiveDateParameter1Code> value) {
			obj.setEffectiveDateParameter(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EffectiveDate1.mmEffectiveDate, com.tools20022.repository.msg.EffectiveDate1.mmEffectiveDateParameter);
				messageBuildingBlock_lazy = () -> Arrays.asList(StandingSettlementInstructionV01.mmEffectiveDateDetails, StandingSettlementInstructionCancellationV01.mmEffectiveDateDetails,
						StandingSettlementInstructionStatusAdviceV01.mmEffectiveDateDetails, StandingSettlementInstructionDeletionV01.mmEffectiveDateDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EffectiveDate1";
				definition = "Date and date parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getEffectiveDate() {
		return effectiveDate;
	}

	public EffectiveDate1 setEffectiveDate(ISODate effectiveDate) {
		this.effectiveDate = Objects.requireNonNull(effectiveDate);
		return this;
	}

	public Optional<ExternalEffectiveDateParameter1Code> getEffectiveDateParameter() {
		return effectiveDateParameter == null ? Optional.empty() : Optional.of(effectiveDateParameter);
	}

	public EffectiveDate1 setEffectiveDateParameter(ExternalEffectiveDateParameter1Code effectiveDateParameter) {
		this.effectiveDateParameter = effectiveDateParameter;
		return this;
	}
}