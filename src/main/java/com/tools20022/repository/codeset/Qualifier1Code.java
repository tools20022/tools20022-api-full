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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Qualifier1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Qualifies the use of the quote or the indication of interest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#AllOrNone
 * Qualifier1Code.AllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code#MarketOnClose
 * Qualifier1Code.MarketOnClose}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#AtClose
 * Qualifier1Code.AtClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code#VolumeWeightedAveragePrice
 * Qualifier1Code.VolumeWeightedAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#InTouchWith
 * Qualifier1Code.InTouchWith}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#Limit
 * Qualifier1Code.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#MoreBehind
 * Qualifier1Code.MoreBehind}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#AtOpen
 * Qualifier1Code.AtOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code#TakingPosition
 * Qualifier1Code.TakingPosition}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#AtMarket
 * Qualifier1Code.AtMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code#ReadyToTrade
 * Qualifier1Code.ReadyToTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code#PortfolioShown
 * Qualifier1Code.PortfolioShown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#ThroughDay
 * Qualifier1Code.ThroughDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#Versus
 * Qualifier1Code.Versus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#WorkingAway
 * Qualifier1Code.WorkingAway}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#Crossing
 * Qualifier1Code.Crossing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#AtMidpoint
 * Qualifier1Code.AtMidpoint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Qualifier1Code#PreOpen
 * Qualifier1Code.PreOpen}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QualifierCode QualifierCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ALNO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Qualifier1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Qualifies the use of the quote or the indication of interest."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Qualifier1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * </ul>
	 */
	public static final Qualifier1Code AllOrNone = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.AllOrNone.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketOnClose"</li>
	 * </ul>
	 */
	public static final Qualifier1Code MarketOnClose = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketOnClose";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.MarketOnClose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtClose"</li>
	 * </ul>
	 */
	public static final Qualifier1Code AtClose = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtClose";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.AtClose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeWeightedAveragePrice"</li>
	 * </ul>
	 */
	public static final Qualifier1Code VolumeWeightedAveragePrice = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.VolumeWeightedAveragePrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTouchWith"</li>
	 * </ul>
	 */
	public static final Qualifier1Code InTouchWith = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTouchWith";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.InTouchWith.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * </ul>
	 */
	public static final Qualifier1Code Limit = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.Limit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoreBehind"</li>
	 * </ul>
	 */
	public static final Qualifier1Code MoreBehind = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreBehind";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.MoreBehind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtOpen"</li>
	 * </ul>
	 */
	public static final Qualifier1Code AtOpen = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtOpen";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.AtOpen.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TakingPosition"</li>
	 * </ul>
	 */
	public static final Qualifier1Code TakingPosition = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TakingPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.TakingPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtMarket"</li>
	 * </ul>
	 */
	public static final Qualifier1Code AtMarket = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.AtMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReadyToTrade"</li>
	 * </ul>
	 */
	public static final Qualifier1Code ReadyToTrade = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReadyToTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.ReadyToTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioShown"</li>
	 * </ul>
	 */
	public static final Qualifier1Code PortfolioShown = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioShown";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.PortfolioShown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThroughDay"</li>
	 * </ul>
	 */
	public static final Qualifier1Code ThroughDay = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThroughDay";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.ThroughDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Versus"</li>
	 * </ul>
	 */
	public static final Qualifier1Code Versus = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Versus";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.Versus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkingAway"</li>
	 * </ul>
	 */
	public static final Qualifier1Code WorkingAway = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingAway";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.WorkingAway.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Crossing"</li>
	 * </ul>
	 */
	public static final Qualifier1Code Crossing = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Crossing";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.Crossing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtMidpoint"</li>
	 * </ul>
	 */
	public static final Qualifier1Code AtMidpoint = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtMidpoint";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.AtMidpoint.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Qualifier1Code
	 * Qualifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreOpen"</li>
	 * </ul>
	 */
	public static final Qualifier1Code PreOpen = new Qualifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreOpen";
			owner_lazy = () -> com.tools20022.repository.codeset.Qualifier1Code.mmObject();
			codeName = QualifierCode.PreOpen.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Qualifier1Code> codesByName = new LinkedHashMap<>();

	protected Qualifier1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ALNO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Qualifier1Code";
				definition = "Qualifies the use of the quote or the indication of interest.";
				trace_lazy = () -> QualifierCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Qualifier1Code.AllOrNone, com.tools20022.repository.codeset.Qualifier1Code.MarketOnClose, com.tools20022.repository.codeset.Qualifier1Code.AtClose,
						com.tools20022.repository.codeset.Qualifier1Code.VolumeWeightedAveragePrice, com.tools20022.repository.codeset.Qualifier1Code.InTouchWith, com.tools20022.repository.codeset.Qualifier1Code.Limit,
						com.tools20022.repository.codeset.Qualifier1Code.MoreBehind, com.tools20022.repository.codeset.Qualifier1Code.AtOpen, com.tools20022.repository.codeset.Qualifier1Code.TakingPosition,
						com.tools20022.repository.codeset.Qualifier1Code.AtMarket, com.tools20022.repository.codeset.Qualifier1Code.ReadyToTrade, com.tools20022.repository.codeset.Qualifier1Code.PortfolioShown,
						com.tools20022.repository.codeset.Qualifier1Code.ThroughDay, com.tools20022.repository.codeset.Qualifier1Code.Versus, com.tools20022.repository.codeset.Qualifier1Code.WorkingAway,
						com.tools20022.repository.codeset.Qualifier1Code.Crossing, com.tools20022.repository.codeset.Qualifier1Code.AtMidpoint, com.tools20022.repository.codeset.Qualifier1Code.PreOpen);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllOrNone.getCodeName().get(), AllOrNone);
		codesByName.put(MarketOnClose.getCodeName().get(), MarketOnClose);
		codesByName.put(AtClose.getCodeName().get(), AtClose);
		codesByName.put(VolumeWeightedAveragePrice.getCodeName().get(), VolumeWeightedAveragePrice);
		codesByName.put(InTouchWith.getCodeName().get(), InTouchWith);
		codesByName.put(Limit.getCodeName().get(), Limit);
		codesByName.put(MoreBehind.getCodeName().get(), MoreBehind);
		codesByName.put(AtOpen.getCodeName().get(), AtOpen);
		codesByName.put(TakingPosition.getCodeName().get(), TakingPosition);
		codesByName.put(AtMarket.getCodeName().get(), AtMarket);
		codesByName.put(ReadyToTrade.getCodeName().get(), ReadyToTrade);
		codesByName.put(PortfolioShown.getCodeName().get(), PortfolioShown);
		codesByName.put(ThroughDay.getCodeName().get(), ThroughDay);
		codesByName.put(Versus.getCodeName().get(), Versus);
		codesByName.put(WorkingAway.getCodeName().get(), WorkingAway);
		codesByName.put(Crossing.getCodeName().get(), Crossing);
		codesByName.put(AtMidpoint.getCodeName().get(), AtMidpoint);
		codesByName.put(PreOpen.getCodeName().get(), PreOpen);
	}

	public static Qualifier1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Qualifier1Code[] values() {
		Qualifier1Code[] values = new Qualifier1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Qualifier1Code> {
		@Override
		public Qualifier1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Qualifier1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}