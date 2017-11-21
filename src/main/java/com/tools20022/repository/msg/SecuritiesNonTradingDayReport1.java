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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.FinancialInstrumentReportingNonWorkingDayReportV01;
import com.tools20022.repository.choice.TradingVenueIdentification1Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details the non-working days of an entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDayReport1#mmIdentification
 * SecuritiesNonTradingDayReport1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDayReport1#mmNonWorkingDay
 * SecuritiesNonTradingDayReport1.mmNonWorkingDay}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingNonWorkingDayReportV01#mmNonWorkingDay
 * FinancialInstrumentReportingNonWorkingDayReportV01.mmNonWorkingDay}</li>
 * </ul>
 * </li>
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
 * "SecuritiesNonTradingDayReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details the non-working days of an entity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesNonTradingDayReport1", propOrder = {"identification", "nonWorkingDay"})
public class SecuritiesNonTradingDayReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TradingVenueIdentification1Choice identification;
	/**
	 * Identification of the specific venue this relates to - operating MIC,
	 * segment MIC, NCA<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
	 * TradingVenueIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDayReport1
	 * SecuritiesNonTradingDayReport1}</li>
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
	 * definition} =
	 * "Identification of the specific venue this relates to - operating MIC, segment MIC, NCA\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesNonTradingDayReport1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the specific venue this relates to - operating MIC, segment MIC, NCA\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradingVenueIdentification1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesNonTradingDay1> nonWorkingDay;
	/**
	 * Provides the non working days of the identified venue. Details on why it
	 * is a non working day are also captured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDay1
	 * SecuritiesNonTradingDay1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDayReport1
	 * SecuritiesNonTradingDayReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonWorkgDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonWorkingDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the non working days of the identified venue. Details on why it is a non working day are also captured."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonWorkingDay = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesNonTradingDayReport1.mmObject();
			isDerived = false;
			xmlTag = "NonWorkgDay";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonWorkingDay";
			definition = "Provides the non working days of the identified venue. Details on why it is a non working day are also captured.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesNonTradingDay1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesNonTradingDayReport1.mmIdentification, SecuritiesNonTradingDayReport1.mmNonWorkingDay);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingNonWorkingDayReportV01.mmNonWorkingDay);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesNonTradingDayReport1";
				definition = "Details the non-working days of an entity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public TradingVenueIdentification1Choice getIdentification() {
		return identification;
	}

	public void setIdentification(TradingVenueIdentification1Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "NonWorkgDay", required = true)
	public List<SecuritiesNonTradingDay1> getNonWorkingDay() {
		return nonWorkingDay;
	}

	public void setNonWorkingDay(List<com.tools20022.repository.msg.SecuritiesNonTradingDay1> nonWorkingDay) {
		this.nonWorkingDay = nonWorkingDay;
	}
}