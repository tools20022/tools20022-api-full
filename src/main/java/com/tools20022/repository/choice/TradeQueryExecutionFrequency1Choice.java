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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.codeset.WeekDay2Code;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the frequency of the trade query execution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice#mmDaily
 * TradeQueryExecutionFrequency1Choice.mmDaily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice#mmWeekly
 * TradeQueryExecutionFrequency1Choice.mmWeekly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice#mmMonthly
 * TradeQueryExecutionFrequency1Choice.mmMonthly}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeQueryExecutionFrequency1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the frequency of the trade query execution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeQueryExecutionFrequency1Choice", propOrder = {"daily", "weekly", "monthly"})
public class TradeQueryExecutionFrequency1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Daly", required = true)
	protected NoReasonCode daily;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice
	 * TradeQueryExecutionFrequency1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Daly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query is executed on a daily basis."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDaily = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice.mmObject();
			isDerived = false;
			xmlTag = "Daly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			definition = "Query is executed on a daily basis.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	@XmlElement(name = "Wkly", required = true)
	protected WeekDay2Code weekly;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.WeekDay2Code
	 * WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice
	 * TradeQueryExecutionFrequency1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wkly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Query is executed on a weekly basis. The day of the week for the query execution should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeekly = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice.mmObject();
			isDerived = false;
			xmlTag = "Wkly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			definition = "Query is executed on a weekly basis. The day of the week for the query execution should be specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WeekDay2Code.mmObject();
		}
	};
	@XmlElement(name = "Mnthly", required = true)
	protected Max3Number monthly;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice
	 * TradeQueryExecutionFrequency1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mnthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Query is executed on a monthly basis. The day of the month of the query execution should be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthly = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice.mmObject();
			isDerived = false;
			xmlTag = "Mnthly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			definition = "Query is executed on a monthly basis. The day of the month of the query execution should be specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice.mmDaily, com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice.mmWeekly,
						com.tools20022.repository.choice.TradeQueryExecutionFrequency1Choice.mmMonthly);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeQueryExecutionFrequency1Choice";
				definition = "Specifies the frequency of the trade query execution.";
			}
		});
		return mmObject_lazy.get();
	}

	public NoReasonCode getDaily() {
		return daily;
	}

	public TradeQueryExecutionFrequency1Choice setDaily(NoReasonCode daily) {
		this.daily = Objects.requireNonNull(daily);
		return this;
	}

	public WeekDay2Code getWeekly() {
		return weekly;
	}

	public TradeQueryExecutionFrequency1Choice setWeekly(WeekDay2Code weekly) {
		this.weekly = Objects.requireNonNull(weekly);
		return this;
	}

	public Max3Number getMonthly() {
		return monthly;
	}

	public TradeQueryExecutionFrequency1Choice setMonthly(Max3Number monthly) {
		this.monthly = Objects.requireNonNull(monthly);
		return this;
	}
}