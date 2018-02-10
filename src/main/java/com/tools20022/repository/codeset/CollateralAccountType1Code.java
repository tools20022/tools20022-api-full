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
import com.tools20022.repository.codeset.CollateralAccountType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the collateral account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code#House
 * CollateralAccountType1Code.House}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code#Client
 * CollateralAccountType1Code.Client}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code#LiquidityProvider
 * CollateralAccountType1Code.LiquidityProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code#Margin
 * CollateralAccountType1Code.Margin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code#DefaultFund
 * CollateralAccountType1Code.DefaultFund}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralAccountTypeCode
 * CollateralAccountTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"HOUS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralAccountType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the collateral account type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralAccountType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code
	 * CollateralAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "House"</li>
	 * </ul>
	 */
	public static final CollateralAccountType1Code House = new CollateralAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "House";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountType1Code.mmObject();
			codeName = CollateralAccountTypeCode.House.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code
	 * CollateralAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * </ul>
	 */
	public static final CollateralAccountType1Code Client = new CollateralAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountType1Code.mmObject();
			codeName = CollateralAccountTypeCode.Client.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code
	 * CollateralAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityProvider"</li>
	 * </ul>
	 */
	public static final CollateralAccountType1Code LiquidityProvider = new CollateralAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityProvider";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountType1Code.mmObject();
			codeName = CollateralAccountTypeCode.LiquidityProvider.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code
	 * CollateralAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * </ul>
	 */
	public static final CollateralAccountType1Code Margin = new CollateralAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountType1Code.mmObject();
			codeName = CollateralAccountTypeCode.Margin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code
	 * CollateralAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFund"</li>
	 * </ul>
	 */
	public static final CollateralAccountType1Code DefaultFund = new CollateralAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFund";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralAccountType1Code.mmObject();
			codeName = CollateralAccountTypeCode.DefaultFund.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralAccountType1Code> codesByName = new LinkedHashMap<>();

	protected CollateralAccountType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HOUS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralAccountType1Code";
				definition = "Specifies the collateral account type.";
				trace_lazy = () -> CollateralAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralAccountType1Code.House, com.tools20022.repository.codeset.CollateralAccountType1Code.Client,
						com.tools20022.repository.codeset.CollateralAccountType1Code.LiquidityProvider, com.tools20022.repository.codeset.CollateralAccountType1Code.Margin,
						com.tools20022.repository.codeset.CollateralAccountType1Code.DefaultFund);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(House.getCodeName().get(), House);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(LiquidityProvider.getCodeName().get(), LiquidityProvider);
		codesByName.put(Margin.getCodeName().get(), Margin);
		codesByName.put(DefaultFund.getCodeName().get(), DefaultFund);
	}

	public static CollateralAccountType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralAccountType1Code[] values() {
		CollateralAccountType1Code[] values = new CollateralAccountType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralAccountType1Code> {
		@Override
		public CollateralAccountType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralAccountType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}