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
import com.tools20022.repository.codeset.RejectionReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for which a request has not been accepted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#UnknownSymbol
 * RejectionReason3Code.UnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#ClosedExchange
 * RejectionReason3Code.ClosedExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#ExceedsLimit
 * RejectionReason3Code.ExceedsLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#TooLate
 * RejectionReason3Code.TooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#InvalidPrice
 * RejectionReason3Code.InvalidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#NotAuthorised
 * RejectionReason3Code.NotAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#NoMatchInquiry
 * RejectionReason3Code.NoMatchInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#NoInstrumentMarket
 * RejectionReason3Code.NoInstrumentMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#NoInventory
 * RejectionReason3Code.NoInventory}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReason3Code#Pass
 * RejectionReason3Code.Pass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code#InsufficientCredit
 * RejectionReason3Code.InsufficientCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UKWN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for which a request has not been accepted."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code UnknownSymbol = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.UnknownSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedExchange"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code ClosedExchange = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.ClosedExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceedsLimit"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code ExceedsLimit = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceedsLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.ExceedsLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code TooLate = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.TooLate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPrice"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code InvalidPrice = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.InvalidPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorised"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code NotAuthorised = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.NotAuthorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchInquiry"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code NoMatchInquiry = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.NoMatchInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInstrumentMarket"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code NoInstrumentMarket = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstrumentMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.NoInstrumentMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInventory"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code NoInventory = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInventory";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.NoInventory.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pass"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code Pass = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.Pass.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCredit"</li>
	 * </ul>
	 */
	public static final RejectionReason3Code InsufficientCredit = new RejectionReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason3Code.mmObject();
			codeName = RejectionReasonCode.InsufficientCredit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason3Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UKWN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason3Code";
				definition = "Specifies the reason for which a request has not been accepted.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason3Code.UnknownSymbol, com.tools20022.repository.codeset.RejectionReason3Code.ClosedExchange,
						com.tools20022.repository.codeset.RejectionReason3Code.ExceedsLimit, com.tools20022.repository.codeset.RejectionReason3Code.TooLate, com.tools20022.repository.codeset.RejectionReason3Code.InvalidPrice,
						com.tools20022.repository.codeset.RejectionReason3Code.NotAuthorised, com.tools20022.repository.codeset.RejectionReason3Code.NoMatchInquiry, com.tools20022.repository.codeset.RejectionReason3Code.NoInstrumentMarket,
						com.tools20022.repository.codeset.RejectionReason3Code.NoInventory, com.tools20022.repository.codeset.RejectionReason3Code.Pass, com.tools20022.repository.codeset.RejectionReason3Code.InsufficientCredit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(ClosedExchange.getCodeName().get(), ClosedExchange);
		codesByName.put(ExceedsLimit.getCodeName().get(), ExceedsLimit);
		codesByName.put(TooLate.getCodeName().get(), TooLate);
		codesByName.put(InvalidPrice.getCodeName().get(), InvalidPrice);
		codesByName.put(NotAuthorised.getCodeName().get(), NotAuthorised);
		codesByName.put(NoMatchInquiry.getCodeName().get(), NoMatchInquiry);
		codesByName.put(NoInstrumentMarket.getCodeName().get(), NoInstrumentMarket);
		codesByName.put(NoInventory.getCodeName().get(), NoInventory);
		codesByName.put(Pass.getCodeName().get(), Pass);
		codesByName.put(InsufficientCredit.getCodeName().get(), InsufficientCredit);
	}

	public static RejectionReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason3Code[] values() {
		RejectionReason3Code[] values = new RejectionReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason3Code> {
		@Override
		public RejectionReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}