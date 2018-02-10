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
import com.tools20022.repository.codeset.TradingFloorOrderHandling1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Description of the parameters under which an order must be handled on the
 * floor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandling1Code#AutomatedPrivate
 * TradingFloorOrderHandling1Code.AutomatedPrivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandling1Code#AutomatedPublic
 * TradingFloorOrderHandling1Code.AutomatedPublic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandling1Code#Manual
 * TradingFloorOrderHandling1Code.Manual}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandlingCode
 * TradingFloorOrderHandlingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ATPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingFloorOrderHandling1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Description of the parameters under which an order must be handled on the floor."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingFloorOrderHandling1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandling1Code
	 * TradingFloorOrderHandling1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomatedPrivate"</li>
	 * </ul>
	 */
	public static final TradingFloorOrderHandling1Code AutomatedPrivate = new TradingFloorOrderHandling1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomatedPrivate";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingFloorOrderHandling1Code.mmObject();
			codeName = TradingFloorOrderHandlingCode.AutomatedPrivate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandling1Code
	 * TradingFloorOrderHandling1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomatedPublic"</li>
	 * </ul>
	 */
	public static final TradingFloorOrderHandling1Code AutomatedPublic = new TradingFloorOrderHandling1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomatedPublic";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingFloorOrderHandling1Code.mmObject();
			codeName = TradingFloorOrderHandlingCode.AutomatedPublic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandling1Code
	 * TradingFloorOrderHandling1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manual"</li>
	 * </ul>
	 */
	public static final TradingFloorOrderHandling1Code Manual = new TradingFloorOrderHandling1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manual";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingFloorOrderHandling1Code.mmObject();
			codeName = TradingFloorOrderHandlingCode.Manual.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingFloorOrderHandling1Code> codesByName = new LinkedHashMap<>();

	protected TradingFloorOrderHandling1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ATPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingFloorOrderHandling1Code";
				definition = "Description of the parameters under which an order must be handled on the floor.";
				trace_lazy = () -> TradingFloorOrderHandlingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingFloorOrderHandling1Code.AutomatedPrivate, com.tools20022.repository.codeset.TradingFloorOrderHandling1Code.AutomatedPublic,
						com.tools20022.repository.codeset.TradingFloorOrderHandling1Code.Manual);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AutomatedPrivate.getCodeName().get(), AutomatedPrivate);
		codesByName.put(AutomatedPublic.getCodeName().get(), AutomatedPublic);
		codesByName.put(Manual.getCodeName().get(), Manual);
	}

	public static TradingFloorOrderHandling1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingFloorOrderHandling1Code[] values() {
		TradingFloorOrderHandling1Code[] values = new TradingFloorOrderHandling1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingFloorOrderHandling1Code> {
		@Override
		public TradingFloorOrderHandling1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingFloorOrderHandling1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}