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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.RatingValueIdentifier;
import com.tools20022.repository.entity.Rating;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Assessment of securities credit and investment risk.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Rating1#mmRatingScheme
 * Rating1.mmRatingScheme}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Rating1#mmValueDate
 * Rating1.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Rating1#mmValueIdentification
 * Rating1.mmValueIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Rating Rating}</li>
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
 * "Rating1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Assessment of securities credit and investment risk."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Rating1", propOrder = {"ratingScheme", "valueDate", "valueIdentification"})
public class Rating1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RatgSchme", required = true)
	protected Max35Text ratingScheme;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmRatingScheme
	 * Rating.mmRatingScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Rating1
	 * Rating1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RatgSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatingScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information regarding the entity that assigns the rating."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Rating1, Max35Text> mmRatingScheme = new MMMessageAttribute<Rating1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Rating.mmRatingScheme;
			componentContext_lazy = () -> com.tools20022.repository.msg.Rating1.mmObject();
			isDerived = false;
			xmlTag = "RatgSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RatingScheme";
			definition = "Information regarding the entity that assigns the rating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Rating1 obj) {
			return obj.getRatingScheme();
		}

		@Override
		public void setValue(Rating1 obj, Max35Text value) {
			obj.setRatingScheme(value);
		}
	};
	@XmlElement(name = "ValDt", required = true)
	protected ISODateTime valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmValueDate
	 * Rating.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Rating1
	 * Rating1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time as from which the rating is valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Rating1, ISODateTime> mmValueDate = new MMMessageAttribute<Rating1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Rating.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Rating1.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date/time as from which the rating is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Rating1 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Rating1 obj, ISODateTime value) {
			obj.setValueDate(value);
		}
	};
	@XmlElement(name = "ValId", required = true)
	protected RatingValueIdentifier valueIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RatingValueIdentifier
	 * RatingValueIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmValue
	 * Rating.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Rating1
	 * Rating1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the rating, which has been assigned to a security by a rating agency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Rating1, RatingValueIdentifier> mmValueIdentification = new MMMessageAttribute<Rating1, RatingValueIdentifier>() {
		{
			businessElementTrace_lazy = () -> Rating.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Rating1.mmObject();
			isDerived = false;
			xmlTag = "ValId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueIdentification";
			definition = "Specifies the rating, which has been assigned to a security by a rating agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RatingValueIdentifier.mmObject();
		}

		@Override
		public RatingValueIdentifier getValue(Rating1 obj) {
			return obj.getValueIdentification();
		}

		@Override
		public void setValue(Rating1 obj, RatingValueIdentifier value) {
			obj.setValueIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Rating1.mmRatingScheme, com.tools20022.repository.msg.Rating1.mmValueDate, com.tools20022.repository.msg.Rating1.mmValueIdentification);
				trace_lazy = () -> Rating.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Rating1";
				definition = "Assessment of securities credit and investment risk.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRatingScheme() {
		return ratingScheme;
	}

	public Rating1 setRatingScheme(Max35Text ratingScheme) {
		this.ratingScheme = Objects.requireNonNull(ratingScheme);
		return this;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public Rating1 setValueDate(ISODateTime valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public RatingValueIdentifier getValueIdentification() {
		return valueIdentification;
	}

	public Rating1 setValueIdentification(RatingValueIdentifier valueIdentification) {
		this.valueIdentification = Objects.requireNonNull(valueIdentification);
		return this;
	}
}