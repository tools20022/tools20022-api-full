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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
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
 * Double volume cap report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmTechnicalRecordIdentification
 * VolumeCapReport2.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmIdentification
 * VolumeCapReport2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmCurrency
 * VolumeCapReport2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmTotalTradingVolume
 * VolumeCapReport2.mmTotalTradingVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmTotalReferencePriceTradingVolume
 * VolumeCapReport2.mmTotalReferencePriceTradingVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmTotalNegotiatedTransactionsTradingVolume
 * VolumeCapReport2.mmTotalNegotiatedTransactionsTradingVolume}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidISINRule#forVolumeCapReport2
 * ConstraintValidISINRule.forVolumeCapReport2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VolumeCapReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Double volume cap report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VolumeCapReport2", propOrder = {"technicalRecordIdentification", "identification", "currency", "totalTradingVolume", "totalReferencePriceTradingVolume", "totalNegotiatedTransactionsTradingVolume"})
public class VolumeCapReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TechRcrdId")
	protected Max35Text technicalRecordIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of a record in a message used as part of error management and feedback messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VolumeCapReport2, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<VolumeCapReport2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VolumeCapReport2.mmObject();
			isDerived = false;
			xmlTag = "TechRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalRecordIdentification";
			definition = "Unique identifier of a record in a message used as part of error management and feedback messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(VolumeCapReport2 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(VolumeCapReport2 obj, Optional<Max35Text> value) {
			obj.setTechnicalRecordIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Id", required = true)
	protected ISINOct2015Identifier identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument using an ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VolumeCapReport2, ISINOct2015Identifier> mmIdentification = new MMMessageAttribute<VolumeCapReport2, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.VolumeCapReport2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the financial instrument using an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(VolumeCapReport2 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(VolumeCapReport2 obj, ISINOct2015Identifier value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VolumeCapReport2, ActiveOrHistoricCurrencyCode> mmCurrency = new MMMessageAttribute<VolumeCapReport2, ActiveOrHistoricCurrencyCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VolumeCapReport2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(VolumeCapReport2 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(VolumeCapReport2 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "TtlTradgVol", required = true)
	protected ImpliedCurrencyAndAmount totalTradingVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTradgVol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTradingVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total traded volume of the instrument in this specific reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VolumeCapReport2, ImpliedCurrencyAndAmount> mmTotalTradingVolume = new MMMessageAttribute<VolumeCapReport2, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VolumeCapReport2.mmObject();
			isDerived = false;
			xmlTag = "TtlTradgVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTradingVolume";
			definition = "Total traded volume of the instrument in this specific reporting period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(VolumeCapReport2 obj) {
			return obj.getTotalTradingVolume();
		}

		@Override
		public void setValue(VolumeCapReport2 obj, ImpliedCurrencyAndAmount value) {
			obj.setTotalTradingVolume(value);
		}
	};
	@XmlElement(name = "TtlRefPricTradgVol", required = true)
	protected ImpliedCurrencyAndAmount totalReferencePriceTradingVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlRefPricTradgVol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReferencePriceTradingVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total volume of trading under reference price waiver as defined under the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VolumeCapReport2, ImpliedCurrencyAndAmount> mmTotalReferencePriceTradingVolume = new MMMessageAttribute<VolumeCapReport2, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VolumeCapReport2.mmObject();
			isDerived = false;
			xmlTag = "TtlRefPricTradgVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReferencePriceTradingVolume";
			definition = "Total volume of trading under reference price waiver as defined under the local regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(VolumeCapReport2 obj) {
			return obj.getTotalReferencePriceTradingVolume();
		}

		@Override
		public void setValue(VolumeCapReport2 obj, ImpliedCurrencyAndAmount value) {
			obj.setTotalReferencePriceTradingVolume(value);
		}
	};
	@XmlElement(name = "TtlNgtdTxsTradgVol", required = true)
	protected ImpliedCurrencyAndAmount totalNegotiatedTransactionsTradingVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2
	 * VolumeCapReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNgtdTxsTradgVol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNegotiatedTransactionsTradingVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total volume of trading under negotiated transactions waiver as defined under the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VolumeCapReport2, ImpliedCurrencyAndAmount> mmTotalNegotiatedTransactionsTradingVolume = new MMMessageAttribute<VolumeCapReport2, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.VolumeCapReport2.mmObject();
			isDerived = false;
			xmlTag = "TtlNgtdTxsTradgVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNegotiatedTransactionsTradingVolume";
			definition = "Total volume of trading under negotiated transactions waiver as defined under the local regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(VolumeCapReport2 obj) {
			return obj.getTotalNegotiatedTransactionsTradingVolume();
		}

		@Override
		public void setValue(VolumeCapReport2 obj, ImpliedCurrencyAndAmount value) {
			obj.setTotalNegotiatedTransactionsTradingVolume(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VolumeCapReport2.mmTechnicalRecordIdentification, com.tools20022.repository.msg.VolumeCapReport2.mmIdentification,
						com.tools20022.repository.msg.VolumeCapReport2.mmCurrency, com.tools20022.repository.msg.VolumeCapReport2.mmTotalTradingVolume, com.tools20022.repository.msg.VolumeCapReport2.mmTotalReferencePriceTradingVolume,
						com.tools20022.repository.msg.VolumeCapReport2.mmTotalNegotiatedTransactionsTradingVolume);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidISINRule.forVolumeCapReport2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VolumeCapReport2";
				definition = "Double volume cap report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public VolumeCapReport2 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public ISINOct2015Identifier getIdentification() {
		return identification;
	}

	public VolumeCapReport2 setIdentification(ISINOct2015Identifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public VolumeCapReport2 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public ImpliedCurrencyAndAmount getTotalTradingVolume() {
		return totalTradingVolume;
	}

	public VolumeCapReport2 setTotalTradingVolume(ImpliedCurrencyAndAmount totalTradingVolume) {
		this.totalTradingVolume = Objects.requireNonNull(totalTradingVolume);
		return this;
	}

	public ImpliedCurrencyAndAmount getTotalReferencePriceTradingVolume() {
		return totalReferencePriceTradingVolume;
	}

	public VolumeCapReport2 setTotalReferencePriceTradingVolume(ImpliedCurrencyAndAmount totalReferencePriceTradingVolume) {
		this.totalReferencePriceTradingVolume = Objects.requireNonNull(totalReferencePriceTradingVolume);
		return this;
	}

	public ImpliedCurrencyAndAmount getTotalNegotiatedTransactionsTradingVolume() {
		return totalNegotiatedTransactionsTradingVolume;
	}

	public VolumeCapReport2 setTotalNegotiatedTransactionsTradingVolume(ImpliedCurrencyAndAmount totalNegotiatedTransactionsTradingVolume) {
		this.totalNegotiatedTransactionsTradingVolume = Objects.requireNonNull(totalNegotiatedTransactionsTradingVolume);
		return this;
	}
}