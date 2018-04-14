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
import com.tools20022.repository.codeset.TradeMarketCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a code for a trade market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeMarketCode#NAFTA
 * TradeMarketCode.NAFTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode#International
 * TradeMarketCode.International}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode#FrenchDomTom
 * TradeMarketCode.FrenchDomTom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode#EuroDomestic
 * TradeMarketCode.EuroDomestic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeMarketCode#Domestic
 * TradeMarketCode.Domestic}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeMarket1Code
 * TradeMarket1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeMarketCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a code for a trade market."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeMarketCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a North American Free Trade Association (NAFTA)
	 * transaction, ie, the first and final agent are both located in the NAFTA
	 * area.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode
	 * TradeMarketCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFTA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NAFTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a North American Free Trade Association (NAFTA) transaction, ie, the first and final agent are both located in the NAFTA area."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final TradeMarketCode NAFTA = new TradeMarketCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NAFTA";
			definition = "Transaction is a North American Free Trade Association (NAFTA) transaction, ie, the first and final agent are both located in the NAFTA area.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeMarketCode.mmObject();
			codeName = "NFTA";
		}
	};
	/**
	 * Transaction has an origin in one country and a destination in another and
	 * is made in the currency of either the origin or destination country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode
	 * TradeMarketCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "International"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has an origin in one country and a destination in another and is made in the currency of either the origin or destination country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final TradeMarketCode International = new TradeMarketCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "International";
			definition = "Transaction has an origin in one country and a destination in another and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeMarketCode.mmObject();
			codeName = "INTL";
		}
	};
	/**
	 * Transaction is between a French Overseas Departments and Territories
	 * (Dom/Tom) and some country in the European Union (France included).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode
	 * TradeMarketCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRDT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchDomTom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is between a French Overseas Departments and Territories (Dom/Tom) and some country in the European Union (France included)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final TradeMarketCode FrenchDomTom = new TradeMarketCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrenchDomTom";
			definition = "Transaction is between a French Overseas Departments and Territories (Dom/Tom) and some country in the European Union (France included).";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeMarketCode.mmObject();
			codeName = "FRDT";
		}
	};
	/**
	 * Transaction is a credit transfer in Euro with its country of origin and
	 * country of destination within the European Union. Origin and destination
	 * countries may be one and the same country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode
	 * TradeMarketCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUDM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EuroDomestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. Origin and destination countries may be one and the same country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final TradeMarketCode EuroDomestic = new TradeMarketCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EuroDomestic";
			definition = "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. Origin and destination countries may be one and the same country.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeMarketCode.mmObject();
			codeName = "EUDM";
		}
	};
	/**
	 * Transaction has an origin and a destination in the same country and is
	 * made in the currency of that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeMarketCode
	 * TradeMarketCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has an origin and a destination in the same country and is made in the currency of that country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final TradeMarketCode Domestic = new TradeMarketCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domestic";
			definition = "Transaction has an origin and a destination in the same country and is made in the currency of that country.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeMarketCode.mmObject();
			codeName = "DMST";
		}
	};
	final static private LinkedHashMap<String, TradeMarketCode> codesByName = new LinkedHashMap<>();

	protected TradeMarketCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeMarketCode";
				definition = "Specifies a code for a trade market.";
				derivation_lazy = () -> Arrays.asList(TradeMarket1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeMarketCode.NAFTA, com.tools20022.repository.codeset.TradeMarketCode.International, com.tools20022.repository.codeset.TradeMarketCode.FrenchDomTom,
						com.tools20022.repository.codeset.TradeMarketCode.EuroDomestic, com.tools20022.repository.codeset.TradeMarketCode.Domestic);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NAFTA.getCodeName().get(), NAFTA);
		codesByName.put(International.getCodeName().get(), International);
		codesByName.put(FrenchDomTom.getCodeName().get(), FrenchDomTom);
		codesByName.put(EuroDomestic.getCodeName().get(), EuroDomestic);
		codesByName.put(Domestic.getCodeName().get(), Domestic);
	}

	public static TradeMarketCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeMarketCode[] values() {
		TradeMarketCode[] values = new TradeMarketCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeMarketCode> {
		@Override
		public TradeMarketCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeMarketCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}